package com.xiao.service;

import com.xiao.common.AjaxResult;
import com.xiao.http.req.ReqLogin;
import com.xiao.http.req.ReqRegister;

public interface UserService {

    AjaxResult<String> geneCode(String phone);

    AjaxResult<String> login(ReqLogin req);

    AjaxResult<String> logout();

    AjaxResult<String> register(ReqRegister req);
}
