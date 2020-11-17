package org.lemon.spring.elkstudy.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable(value = "name") String name) {
        logger.info("测试" + name);
        return "hello:" + name;
    }

    public static void main(String[] args) {

    }
}
