package com.kinds.test;

import java.util.Iterator;
import java.util.Set;

import redis.clients.jedis.Jedis;
/*
 * keys���ԣ�������������ģʽƥ���ֵ
 * *��ʾƥ���ȡ����keyֵ
 * �����ȡ����keyֵ�����
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
