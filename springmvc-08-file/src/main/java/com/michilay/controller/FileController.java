package com.michilay.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@RestController
public class FileController {

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {

        //获取文件名
        String originalFilename = file.getOriginalFilename();

        //如果文件名为空，则返回首页
        if ("".equals(originalFilename)){
            return "redirect:/index.jsp";
        }
        System.out.println("上传文件名："+originalFilename);

        //上传路径保存设置
        String path = request.getServletContext().getRealPath("/upload");
        //如果路径不存在则创建一个
        File realPath = new File(path);
        if(!realPath.exists()){
            realPath.mkdir();
        }
        System.out.println("上传文件保存地址："+realPath);

        InputStream inputStream = file.getInputStream();//文件输入流
        OutputStream os = new FileOutputStream(new File(realPath, originalFilename));

        //读取写出
        int len = 0 ;
        byte[] buffer = new byte[1024];
        while ((len=inputStream.read(buffer))!=-1){
            os.write(buffer,0,len);
            os.flush();
        }
        os.close();
        inputStream.close();
        return "redirect:/index.jsp";
    }

    @RequestMapping("/upload2")
    public String upload2(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest request) throws IOException {
        String path = request.getServletContext().getRealPath("/upload");
        File realPath = new File(path);
        if (!realPath.exists()){
            realPath.mkdir();
        }
        //上传文件地址
        System.out.println("上传文件保存地址："+realPath);
        //通过CommonsMultipartFile的方法直接写文件
        file.transferTo(new File(realPath+"/"+file.getOriginalFilename()));

        return "redirect:/index.jsp";
    }
}
