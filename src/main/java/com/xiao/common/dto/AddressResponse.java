package com.xiao.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 地址解析接口返回结构.
 */
@Data
public class AddressResponse {

    @Schema(description = "状态码")
    private Integer code;

    @Schema(description = "完整地址")
    private String address;

    @Schema(description = "经度")
    private Double lon;

    @Schema(description = "纬度")
    private Double lat;

    @Schema(description = "国家/地区")
    private String nation;

    @Schema(description = "省份")
    private String province;

    @Schema(description = "城市")
    private String city;

    @Schema(description = "区县")
    private String county;

    @Schema(description = "街道/镇")
    private String town;

    @JsonProperty("province_code")
    @Schema(description = "省份行政编码")
    private String provinceCode;

    @JsonProperty("city_code")
    @Schema(description = "城市行政编码")
    private String cityCode;

    @JsonProperty("county_code")
    @Schema(description = "区县行政编码")
    private String countyCode;

    @JsonProperty("town_code")
    @Schema(description = "街道行政编码")
    private String townCode;

    @JsonProperty("address_near")
    @Schema(description = "附近地址")
    private String addressNear;

    @JsonProperty("address_distance")
    @Schema(description = "附近地址距离")
    private Integer addressDistance;

    @JsonProperty("address_position")
    @Schema(description = "附近地址方位")
    private String addressPosition;

    @Schema(description = "兴趣点名称")
    private String poi;

    @JsonProperty("poi_distance")
    @Schema(description = "兴趣点距离")
    private Integer poiDistance;

    @JsonProperty("poi_position")
    @Schema(description = "兴趣点方位")
    private String poiPosition;

    @Schema(description = "道路名称")
    private String road;

    @JsonProperty("road_distance")
    @Schema(description = "道路距离")
    private Integer roadDistance;

    @Schema(description = "道路类型/编号")
    private Integer hctype;
}
