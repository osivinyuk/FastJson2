package org.example.dto;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GpuCardDTO {
    @JSONField(name = "id")
    int id;

    @JSONField(name = "name")
    String name;

    /**
     * GPU usage percent
     */
    @JSONField(name = "gpu")
    double gpu;

    /**
     * NVDEC usage percent
     */
    @JSONField(name = "nv_dec")
    double nvDec;

    /**
     * NVENC usage percent
     */
    @JSONField(name = "nv_enc")
    double nvEnc;

    /**
     * total GPU memory
     */
    @JSONField(name = "total_mem")
    double totalMem;

    /**
     * free GPU memory
     */
    @JSONField(name = "free_mem")
    double freeMem;
}
