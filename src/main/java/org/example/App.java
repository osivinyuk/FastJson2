package org.example;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONReader;
import org.example.dto.ServerDTO;

public class App {
    public static void main(String[] args) {
        String json = """
                {"ip":"","external_ip":"127.0.0.1","network_interfaces":{"lo":"kubernetes.docker.internal","wlan2":"LAPTOP-D0AI8Q0U"},"server_id":1,"totalMem":15,"freeMem":3,"cpu":{"avg":8,"max":23},"graphics":[],"analytics":[],"services":[],"support":["alpr","smart_va","military","object_in_zone"]}
                """;
        ServerDTO object = JSON.parseObject(json, ServerDTO.class);

        System.out.println(JSON.toJSONString(object));
    }
}

