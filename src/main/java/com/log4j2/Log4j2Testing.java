package com.log4j2;
  
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sun.rmi.runtime.Log;

public class Log4j2Testing {  
  
    private static Logger logger = LogManager.getLogger(Log4j2Testing.class);
      
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        for(int i=0; i<1; i++){
            logger.trace("===root trace");
            logger.debug("===root debug");  
            logger.info("===root info");  
            logger.warn("===root warn");  
            logger.error("===root error");  
            logger.fatal("===root fatal");  
//              logger.log(Level.forName("VERBOSE",500),"a verbose message");
            try {  
                Thread.sleep(1000);//等10秒钟
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
    }  
  
}