package com.xiao.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoleEnum {
    ADMIN("ADMIN", "管理员"),
    USER("USER", "用户");

    private final String code;
    private final String desc;
}
