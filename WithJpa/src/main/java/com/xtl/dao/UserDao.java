package com.xtl.dao;

import com.xtl.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 31925
 */
public interface UserDao extends JpaRepository<User,Long> {
    /**
     * 根据用户名查找用户
     * @param username 用户名
     * @return 用户
     */
    User findUserByUsername(String username);
}
