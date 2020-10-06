package com.zhent.md5.study.service;

import com.zhent.md5.study.util.MD5Util;

/**
 * @ClassName MD5Service
 * @Description TODO
 * @Author 田震
 * @Date 2020/10/6
 **/
public class MD5Service {
    public String getMD5( String input ) {
        return MD5Util.getMD5( input.getBytes() );
    }
}