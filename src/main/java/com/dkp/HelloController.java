package com.dkp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kunpeng on 2017/4/22.
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String index(){
        return "welcome";
    }

    @ResponseBody
    @RequestMapping("/test")
    public ReadBook test(){

        ReadBook book = new ReadBook();
        book.setNane("Java并发编程的艺术");
        book.setAuthor("方腾飞");
        book.setBookDesc("从JDK源码、JVM、CPU等多角度全面的剖析与讲解Java并发编程框架、原理和核心技术");
        return book;
    }
}
