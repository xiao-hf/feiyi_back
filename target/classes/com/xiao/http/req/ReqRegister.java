package com.xiao.http.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReqRegister {
    @Schema(description = "用户名")
    @NotBlank(message = "用户名不能为空")
    private String username;

    @Schema(description = "手机号")
    @NotBlank(message = "手机号不能为空")
    private String phone;

    @Schema(description = "密码")
    @NotBlank(message = "密码不能为空")
    private String password;

    @Schema(description = "验证码")
    @NotBlank(message = "验证码不能为空")
    private String code;

    @Schema(description = "真实姓名")
    private String realName;

    @Schema(description = "身份证号")
    private String idCard;

    @Schema(description = "性别：0女 1男")
    private Integer gender;

    @Schema(description = "电子邮箱")
    private String email;

    @Schema(description = "头像URL")
    private String avatar;

    @Schema(description = "职位")
    private String position;

    @Schema(description = "所属单位/部门ID")
    private Long unitId;
}
