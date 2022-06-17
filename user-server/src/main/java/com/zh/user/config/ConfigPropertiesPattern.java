package com.zh.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @note
 * @Author ZhaoHB
 * @Date 2021-11-18 17:31
 * @Version 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class ConfigPropertiesPattern {
    private String deteformat111;
    private String name;
}
