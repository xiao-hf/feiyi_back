package com.xiao.service;

import com.xiao.dao.SysLoginLog;
import com.xiao.dao.SysOperationLog;

public interface LogService {
    void saveOperationLog(SysOperationLog log);
    void saveLoginLog(SysLoginLog log);
}
