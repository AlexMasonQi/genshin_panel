package com.alex.genshin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.alex"})
public class GenshinPanelServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenshinPanelServerApplication.class, args);
    }

}
