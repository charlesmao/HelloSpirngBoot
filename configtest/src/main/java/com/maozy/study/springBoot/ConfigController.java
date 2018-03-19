package com.maozy.study.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by maozy on 2018/3/17.
 */
@Controller
public class ConfigController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/prop")
    @ResponseBody
    public String getName () {
        System.out.println("aaabddd");
        return applicationContext.getEnvironment().getProperty("person.name.value");
    }
}
