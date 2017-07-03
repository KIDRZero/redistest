package com.kinds.test;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

/*
 * 测试redis的哈希类型
 * hmset用来存储value值为map的
 * 哈希的操作都是以h开头
 */
public class RedisHashSet {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		Map<String, String> map = new HashMap<>();
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		map.put("k4", "v4");
	    jedis.hmset("haha", map);
	    jedis.hset("haha", "k5", "v5");//用来向指定位置存入多个键值对
	    System.out.println("散列haha的所有键值对:"+jedis.hgetAll("haha"));
	    System.out.println("散列haha的所有key值为:"+jedis.hkeys("haha"));
	    System.out.println("散列haha的所有键值对:"+jedis.hvals("haha"));
	    jedis.hincrBy("haha", "k6", 6);//将k6对应的val值加6，若不存在k6，那么会自动添加k6
	    System.out.println("散列haha的所有键值对:"+jedis.hgetAll("haha"));
	    System.out.println("散列删除一个或多个键值对:"+jedis.hdel("haha", "k2"));
	    System.out.println("散列haha的所有键值对:"+jedis.hgetAll("haha"));
	    System.out.println("散列haha的键值对个数:"+jedis.hlen("haha"));
	    System.out.println("判断hash中是否存在key3:"+jedis.hexists("haha","k3"));
	    System.out.println("判断hash中是否存在key2:"+jedis.hexists("haha","k2"));
	    System.out.println("判断hash中key3的值:"+jedis.hmget("haha","k3"));
	    System.out.println("判断hash中key3，key4的值:"+jedis.hmget("haha","k3","k4"));
	    
	}
}
