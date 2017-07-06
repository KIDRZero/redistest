package com.ycy.redis;

import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;
import com.ycy.redis.*;
/*
 * 经测试这种方式是行不通的，坑爹的要求
 * 当jedis订阅频道时处于阻塞状态，无法发布消息让自身收到
 * 即使在main函数再创建一个jedis，也是行不通的，需要在两个main函数分别创建jedis
 * 
 */
public class TestSubPub {
	 
    public static void main(String[] args) {
    	 MyJedisPubSub m=new MyJedisPubSub();
		Jedis jedis=new Jedis("localhost");
		
		jedis.subscribe(m, "mychannel");
		//jedis.publish("mychannel", "hello xiaomi");	
	//	Jedis jedis2=new Jedis("localhost");
	//	jedis2.publish("mychannel", "hello moto");
	}
   
}
