package com.zhent.md5.study.configuration;

import com.zhent.md5.study.service.MD5Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MD5AutoConfiguration
 * @Description TODO
 * @Author 田震
 * @Date 2020/10/6
 **/
@Configuration
public class MD5AutoConfiguration {
    @Bean
    MD5Service md5Service() {
        return new MD5Service();
    }
}