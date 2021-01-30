package com.howardli.study.testdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author weihua li 2021/1/31
 */

@Component
@PropertySource(value = {"classpath:propertiesTest.properties"})
@ConfigurationProperties(prefix = "iphone")
public class Config {

    private List<iPhone> info;

    public List<iPhone> getInfo() {
        return info;
    }

    public void setInfo(List<iPhone> info) {
        this.info = info;
    }

    public static class iPhone{

        private String uuid;
        private String appiumPort;
        private String wdaPort;

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getAppiumPort() {
            return appiumPort;
        }

        public void setAppiumPort(String appiumPort) {
            this.appiumPort = appiumPort;
        }

        public String getWdaPort() {
            return wdaPort;
        }

        public void setWdaPort(String wdaPort) {
            this.wdaPort = wdaPort;
        }
    }
}
