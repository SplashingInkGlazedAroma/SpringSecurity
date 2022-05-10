package com.xtl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.web.bind.annotation.*;

/**
 * @author 31925
 * @className HelloController
 * @description TODO
 * @date 2022/5/9 16:37
 */
@RestController
@Slf4j
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        WebAuthenticationDetails details = (WebAuthenticationDetails) authentication.getDetails();
        log.info("用户信息是:{}",details);
        return "hello";
    }
}
