package com.education.open;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: InterfaceBootApplication
 * Description:
 * date: 2019/12/27 10:58
 *
 * @author xujin <br/>
 * @since JDK 1.8
 */
@EnableDiscoveryClient
@SpringBootApplication
public class InterfaceBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(InterfaceBootApplication.class,args);
    }
}
