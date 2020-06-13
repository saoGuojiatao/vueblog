package com.gjt.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：com.gjt
 * @description：TODO
 * @date ：Created in 2020/6/10 11:01
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;

    private String username;

    private String avatar;

    private String email;
}
