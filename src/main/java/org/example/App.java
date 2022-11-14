package org.example;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;

public class App {
    public static void main(String[] args) {
        String json = """
                {"id":1, "name":"Name", "user_name":"User name"}
                """;
        User object = JSON.parseObject(json, User.class);

        System.out.println(JSON.toJSONString(object, JSONWriter.Feature.WriteNulls));
    }
}

