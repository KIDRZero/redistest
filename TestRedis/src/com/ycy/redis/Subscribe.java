package com.ycy.redis;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class Subscribe {
	 private Jedis jedis = null;  
	    @Before  
	    public void init() {  
	        jedis = new Jedis("localhost");  
	    }  
	    @Test   
	    public void subcribe() {  
	          
	        JedisPubSub jedisPubSub = new jedis_pub_sub_listener();  
	        //�����ܵ�  
	        jedis.subscribe(jedisPubSub  , "channel1");  
	    }  
	}  
	class jedis_pub_sub_listener extends  JedisPubSub {  
	      
	    @Override  
	    public void proceed(Client client, String... channels) {  
	        super.proceed(client, channels);  
	    }  
	  
	    @Override
	    //���յ���Ϣ��Ĵ�����
	    public void onMessage(String channel, String message) {  
	        System.out.println(message);  
	        //��Ϣ������  
	        super.onMessage(channel, message);  
	    }     
}
