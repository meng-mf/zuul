package com.mf.web;

import com.mf.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test01Controller
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/5
 * @Version V1.0
 **/
@RestController
public class Test01Controller {
    @Autowired
    private TestApi testApi;

    @RequestMapping("test02/{name}")
    public String test01(@PathVariable String name){
        System.out.println("-----test02------");
        return testApi.test01(name);
    }
}
