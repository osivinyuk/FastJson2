package org.example;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Value;

@Value
public class User {
    @JSONField(name = "id")
    int id;
    @JSONField(name = "name")
    String name;
    @JSONField(name = "user_name")
    String userName;
}
