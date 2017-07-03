package com.kinds.test;

import java.util.Iterator;
import java.util.Set;

import redis.clients.jedis.Jedis;
/*
 * keys测试，这里用来进行模式匹配键值
 * *表示匹配获取所有key值
 * 这里获取所有key值并输出
 */
public class RedisKeysTest {
   public static void main(String[] args) {
	   Jedis jedis=new Jedis("localhost");
	   Set<String> redis=jedis.keys("*");
	   Iterator<String> itera= redis.iterator();
	   while(itera.hasNext()){
		  String key= itera.next();
		  System.out.println(key);
	   }
}
}
