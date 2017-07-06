package com.ycy.redis;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;

public class Publish {
	  private Jedis jedis = null;  
	    @Before  
	    public void init() {  
	        jedis = new Jedis("localhost");  
	    }  
	    @Test   
	    public void publish() {   
	        while(true) {  
	            //发布消息  
	            jedis.publish("channel1", "hahha");  
	            try {  
	                Thread.currentThread().sleep(1000);  
	            } catch (InterruptedException e) {  
	                // TODO Auto-generated catch block  
	                e.printStackTrace();  
	            }  
	        }  
	    }  
}
