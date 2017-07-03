package com.connection.test;

import redis.clients.jedis.Jedis;
/*
 * 测试jedis连接redis服务器
 */
public class RedisConnection {
     public static void main(String[] args) {
		Jedis jedis=new Jedis("localhost");
		System.out.println("如果连接成功,这里显示PONG  "+jedis.ping());
	}
}
