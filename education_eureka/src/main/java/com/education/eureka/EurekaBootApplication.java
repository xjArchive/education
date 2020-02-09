package com.education.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName: EurekaBootApplication
 * Description:
 * date: 2019/12/26 17:49
 *
 * @author xujin <br/>
 * @since JDK 1.8
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaBootApplication.class,args);
    }
}
