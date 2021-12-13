package com.adun;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Zhu Dunfeng
 * @date 2021/12/13 11:07
 */
public class Test {
    private static final Logger logger= LogManager.getLogger(Test.class);
    public static void main(String[] args) {

        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");

//        String user="${java:vm}";
//        String user="${java:version}";
//        String user="${java:runtime}";
        String user="${java:os}";
//        String user="${java:locale}";
//        String user="${java:hw}";
        //jndi注入
        logger.info("user{}",user);
        logger.info("${env:USER}");
    }
}
