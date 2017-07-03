package com.kinds.test;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class RedisZsetTest {
   public static void main(String[] args) {
	   Jedis jedis=new Jedis("localhost");
	   Map<Double,String> map = new HashMap<>();
       map.put(1.2,"key2");
       map.put(4.0, "key3");
       map.put(5.0,"key4");
       map.put(0.2,"key5");
       System.out.println(jedis.zadd("zset", 3,"key1"));
     //  System.out.println(jedis.zadd("zset",map));
       System.out.println("zset�е�����Ԫ�أ�"+jedis.zrange("zset", 0, -1));
       System.out.println("zset�е�����Ԫ�أ�"+jedis.zrangeWithScores("zset", 0, -1));
       System.out.println("zset�е�����Ԫ�أ�"+jedis.zrangeByScore("zset", 0,100));
       System.out.println("zset�е�����Ԫ�أ�"+jedis.zrangeByScoreWithScores("zset", 0,100));
       System.out.println("zset��key2�ķ�ֵ��"+jedis.zscore("zset", "key2"));
       System.out.println("zset��key2��������"+jedis.zrank("zset", "key2"));
       System.out.println("ɾ��zset�е�Ԫ��key3��"+jedis.zrem("zset", "key3"));
       System.out.println("zset�е�����Ԫ�أ�"+jedis.zrange("zset", 0, -1));
       System.out.println("zset��Ԫ�صĸ�����"+jedis.zcard("zset"));
       System.out.println("zset�з�ֵ��1-4֮���Ԫ�صĸ�����"+jedis.zcount("zset", 1, 4));
       System.out.println("key2�ķ�ֵ����5��"+jedis.zincrby("zset", 5, "key2"));
       System.out.println("key3�ķ�ֵ����4��"+jedis.zincrby("zset", 4, "key3"));
       System.out.println("zset�е�����Ԫ�أ�"+jedis.zrange("zset", 0, -1));
}
}
