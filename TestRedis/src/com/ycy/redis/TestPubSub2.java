package com.ycy.redis;

import redis.clients.jedis.Jedis;
/*
 * ���ﵱ��������
 */
public class TestPubSub2 {
   public static void main(String[] args) {
	   Jedis jedis=new Jedis("localhost");
	   jedis.publish("mychannel", "whats up");
}
}
