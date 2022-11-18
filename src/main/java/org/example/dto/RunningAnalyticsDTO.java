package org.example.dto;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RunningAnalyticsDTO {
    @JSONField(name = "id")
    int id;

    @JSONField(name = "up_time")
    long upTime;

    @JSONField(name = "gpu_id")
    int gpuId;
}
