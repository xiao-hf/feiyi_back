package com.xiao.controller;

import com.xiao.common.AjaxResult;
import com.xiao.common.dto.AddressResponse;
import com.xiao.common.dto.WeatherResponse;
import com.xiao.utils.RequestUtil;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 公共数据查询接口.
 */
@Slf4j
@RestController
@RequestMapping("/common")
public class CommonController {

    private static final String API_ID = "10011495";
    private static final String API_KEY = "dfaefdafdsaeaff";

    private static final String WEATHER_API =
            "https://cn.apihz.cn/api/tianqi/tqybjw5.php?id={id}&key={key}&lat={lat}&lon={lon}";
    private static final String ADDRESS_API =
            "https://cn.apihz.cn/api/other/jwjuhe2.php?id={id}&key={key}&lon={lon}&lat={lat}";

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/weather")
    public AjaxResult<WeatherResponse> getWeather(@RequestParam("lat") Double lat,
                                                  @RequestParam("lon") Double lon,
                                                  HttpServletRequest request) {
        log.info("Weather request from {} lat:{} lon:{}",
                RequestUtil.getClientSummary(request), lat, lon);
        try {
            WeatherResponse body = restTemplate.getForObject(
                    WEATHER_API, WeatherResponse.class, API_ID, API_KEY, lat, lon);
            if (body == null || body.getCode() == null || body.getCode() != 200) {
                return AjaxResult.error("获取天气失败");
            }
            return AjaxResult.success(body);
        } catch (Exception e) {
            log.error("调用天气接口失败", e);
            return AjaxResult.error("获取天气失败: " + e.getMessage());
        }
    }

    @GetMapping("/address")
    public AjaxResult<AddressResponse> getAddress(@RequestParam("lat") Double lat,
                                                  @RequestParam("lon") Double lon,
                                                  HttpServletRequest request) {
        log.info("Address request from {} lat:{} lon:{}",
                RequestUtil.getClientSummary(request), lat, lon);
        try {
            AddressResponse body = restTemplate.getForObject(
                    ADDRESS_API, AddressResponse.class, API_ID, API_KEY, lon, lat);
            if (body == null || body.getCode() == null || body.getCode() != 200) {
                return AjaxResult.error("获取地址失败");
            }
            return AjaxResult.success(body);
        } catch (Exception e) {
            log.error("调用地址接口失败", e);
            return AjaxResult.error("获取地址失败: " + e.getMessage());
        }
    }
}
