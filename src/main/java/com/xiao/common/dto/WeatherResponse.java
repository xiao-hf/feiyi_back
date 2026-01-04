package com.xiao.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.Data;

/**
 * 天气接口返回结构.
 */
@Data
public class WeatherResponse {

    @Schema(description = "状态码")
    private Integer code;

    @Schema(description = "数据条数")
    private Integer cnt;

    @Schema(description = "城市名称")
    private String name;

    @Schema(description = "国家")
    private String country;

    @Schema(description = "日出时间戳")
    private Long sunrise;

    @Schema(description = "日落时间戳")
    private Long sunset;

    @Schema(description = "逐时天气数据")
    private List<WeatherItem> data;

    @Data
    public static class WeatherItem {

        @Schema(description = "时间戳")
        private Long dt;

        @Schema(description = "时间字符串")
        private String time;

        @Schema(description = "当前温度")
        private Double temp;

        @Schema(description = "最高温度")
        private Double temph;

        @Schema(description = "气压")
        private Integer pressure;

        @Schema(description = "湿度")
        private Integer humidity;

        @Schema(description = "天气描述")
        private String weather;

        @Schema(description = "云量")
        private Integer clouds;

        @Schema(description = "风速")
        private Double speed;

        @Schema(description = "风向角度")
        private Integer deg;

        @Schema(description = "能见度")
        private Integer visibility;

        @JsonProperty("temph")
        public void setTemph(Double temph) {
            this.temph = temph;
        }
    }
}
