package com.xk.service;

import com.xk.domain.LoginUser;
import com.xk.entity.SysUser;

import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
public interface SysUserService {
    com.xk.utils.ResponseUtil userLogin(LoginUser loginUser);

    List<SysUser> getHotUsers();
}
