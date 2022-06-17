package com.zh.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @note
 * @Author ZhaoHB
 * @Date 2021-11-18 17:59
 * @Version 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "ztcloud")
public class ConfigPropertiesZtcloud {
    private String zhb1;
    private Integer hong;
    private String biao;
}
