package com.xtl.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 31925
 * @className MyUser
 * @description TODO
 * @date 2022/5/9 17:24
 */
@Data
public class MyUser implements Serializable {
    private static final long serialVersionUID = -1090551705063344205L;

    private String userName;
    private String password;
    private boolean accountNonExpired = true;

    private boolean accountNonLocked = true;

    private boolean credentialsNonExpired = true;

    private boolean enabled = true;
}
