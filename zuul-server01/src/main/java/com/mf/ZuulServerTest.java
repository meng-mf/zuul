package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ZuulServerTest
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/5
 * @Version V1.0
 **/
@SpringBootApplication
@EnableZuulProxy
@RestController
public class ZuulServerTest {
    public static void main(String[] args){

        SpringApplication.run(ZuulServerTest.class,args);

    }

    @RequestMapping("testPath")
    public String testPath(){
        System.out.println("------testPath--------");
        return "testPath-ok";
    }
}
