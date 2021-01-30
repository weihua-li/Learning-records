package com.howardli.study.testdemo.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author weihua li 2021/1/31
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConfigTest {

    @Autowired
    private Config config;

    @Test
    public void testListMapConfig(){
        List<Config.iPhone> list = config.getInfo();
        for (Config.iPhone iphone : list) {
            System.out.println("uuid: "+iphone.getUuid());
            System.out.println("appiumPort: "+iphone.getAppiumPort());
            System.out.println("wdaPort: "+iphone.getWdaPort());
        }
    }
}
