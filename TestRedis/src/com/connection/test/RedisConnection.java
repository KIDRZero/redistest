package com.connection.test;

import redis.clients.jedis.Jedis;
/*
 * ����jedis����redis������
 */
public class RedisConnection {
     public static void main(String[] args) {
		Jedis jedis=new Jedis("localhost");
		System.out.println("������ӳɹ�,������ʾPONG  "+jedis.ping());
	}
}
