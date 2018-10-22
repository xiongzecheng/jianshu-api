package com.xk.dao;

import com.xk.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
public interface SysUserRepositry  extends JpaRepository<SysUser, Integer> {
    /**
     * 根据邮箱查找用户
     * @param email
     * @return
     */
    SysUser findSysUserByEmail(String email);

    /**
     * 根据热度降序排列
     * JPQL语句
     * @return
     */
    @Query("FROM SysUser  u ORDER BY u.likeCount DESC ")
    List<SysUser> findHotUsers();
}
