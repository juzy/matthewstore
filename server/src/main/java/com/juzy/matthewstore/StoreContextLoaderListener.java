package com.juzy.matthewstore;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * User: xizhao.xsz
 * Time:2014-05-26 13:42
 */
public class StoreContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
      System.out.println("storeContextLoaderListener initialized----getEvent:"+sce.toString());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
      System.out.println("storeContextLoaderListener destroyed-----getEvent:"+sce.toString());
    }
}
