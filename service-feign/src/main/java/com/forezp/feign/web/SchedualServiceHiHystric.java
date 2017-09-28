package com.forezp.feign.web;

import com.forezp.feign.service.api.SchedualServiceHiApi;
import org.springframework.stereotype.Component;

/**
 * Created by qianjing on 2017/9/18.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHiApi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
