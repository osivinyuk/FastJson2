package org.example.dto;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RunningServiceDTO {
    @JSONField(name = "type")
    String type;

    @JSONField(name = "ready")
    boolean isReady;
}
