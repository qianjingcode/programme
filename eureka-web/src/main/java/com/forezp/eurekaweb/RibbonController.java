package com.forezp.eurekaweb;


import com.forezp.ribbon.HelloRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qianjing on 2017/9/15.
 */
@RestController
public class RibbonController {

    @Autowired
    HelloRibbonService helloService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

}
