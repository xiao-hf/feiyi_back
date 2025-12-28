package com.xiao.http.req;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReqWxLogin {

    @Schema(description = "微信小程序 openId")
    @JsonProperty("openId")
    @JsonAlias({"openid", "openID", "open_id", "oipenId"})
    @NotBlank(message = "openId 不能为空")
    private String openId;
}
