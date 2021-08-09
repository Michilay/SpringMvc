package com.michilay.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

public class JsonUtils {

    public static String getJson(Object object){
        return getJson(object,"yyyy-mm-dd hh:mm:ss");
    }

    public static String getJson(Object object,String dataFomat){
        ObjectMapper mapper = new ObjectMapper();

//        不使用时间戳
        mapper.configure(SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS,false);
        SimpleDateFormat sdf = new SimpleDateFormat(dataFomat);
        mapper.setDateFormat(sdf);
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
