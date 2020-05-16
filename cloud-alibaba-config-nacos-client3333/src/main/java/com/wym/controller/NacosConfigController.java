package com.wym.controller;

import com.wym.pojo.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NacosConfigController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public CommonResult<String> getConfigInfo(){
        return new CommonResult<String>(200,"请求成功！",configInfo);
    }

}
