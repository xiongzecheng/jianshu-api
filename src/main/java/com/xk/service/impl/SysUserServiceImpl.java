package com.xk.service.impl;

import com.xk.dao.SysUserRepositry;
import com.xk.entity.LoginUser;
import com.xk.entity.SysUser;
import com.xk.service.SysUserService;
import com.xk.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserRepositry sysUserRepositry;

    @Override
    public ResponseUtil userLogin(LoginUser loginUser) {
        SysUser sysUser = sysUserRepositry.findSysUserByEmail(loginUser.getEmail());
        //邮箱有效
        if (sysUser != null) {
            //判断密码是否正确
            if (loginUser.getPassword().equals(sysUser.getPassword())) {
                return new ResponseUtil(0, "login success", sysUser);
            } else {
                return new ResponseUtil(0, "password wrong");
            }
        } else {
            return new ResponseUtil(0, "email wrong");
        }
    }

    @Override
    public List<SysUser> getHotUsers() {
        return sysUserRepositry.findHotUsers();
    }
}
