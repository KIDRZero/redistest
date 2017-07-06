package com.ycy.redis;

import redis.clients.jedis.Jedis;
/*
 * 这里当个发布者
 */
public class TestPubSub2 {
   public static void main(String[] args) {
	   Jedis jedis=new Jedis("localhost");
	   jedis.publish("mychannel", "whats up");
}
}
