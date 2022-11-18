package org.example.dto;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Value
@AllArgsConstructor
public class ServerDTO {
    @JSONField(name = "server_id")
    String id;

    @JSONField(name = "cpu")
    CPUDTO cpu;

    @JSONField(name = "total_mem")
    double totalMem;

    @JSONField(name = "free_mem")
    double freeMem;

    @JSONField(name = "ip")
    String ip;

    @JSONField(name = "external_ip")
    String externalIp;

    @JSONField(name = "external_interface")
    String externalInterface;

    @JSONField(name = "network_interfaces")
    HashMap<String, String> netInterfaces;

    @JSONField(name = "version")
    String version;

    @JSONField(name = "graphics")
    List<GpuCardDTO> graphics;

    @JSONField(name = "analytics")
    List<RunningAnalyticsDTO> runningAnalytics;

    @JSONField(name = "services")
    List<RunningServiceDTO> runningServices;

    @JSONField(name = "support")
    List<String> support;

    @JSONField(name = "params")
    JSONObject params;

    @JSONField(name = "analytics_changed", defaultValue = "true")
    boolean analyticsChanged;

    @JSONField(name = "preview_port")
    int previewPort;

    @JSONField(name = "analytics_gpu_binding")
    Map<Integer, Set<String>> analyticsGpuBinding;
}
