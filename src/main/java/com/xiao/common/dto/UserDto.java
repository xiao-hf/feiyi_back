package com.xiao.common.dto;

import com.xiao.dao.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserDto extends User {
    RoleDto roleDto;
}
