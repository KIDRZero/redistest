package com.kinds.test;

import redis.clients.jedis.Jedis;
/*
 * jedis的字符串测试
 */
public class RedisStringTest {
    public static void main(String[] args) {
		Jedis jedis=new Jedis("localhost");
		jedis.set("xxxx", "yyyy");
		System.out.println("jedis在xxxx这个key中存储的值为===>"+jedis.get("xxxx"));
		jedis.set("t2", "v2");
		jedis.set("t3", "v3");
		System.out.println("删除键t2(删除成功返回1):"+jedis.del("t2"));
		System.out.println("获取键t2对应的value值:"+jedis.get("t2"));
		jedis.set("t3", "v3v3");
		System.out.println("修改后t3的value值为:"+jedis.get("t3"));
		jedis.append("t3", "hello");//追加
		System.out.println("对t3对应的value追加值:"+jedis.get("t3"));
		jedis.mset("k1","v1","k2","v2","k3","v3","k4","v4","k5","v5");
		System.out.println("jedis获取多个键值对应的value值:"+jedis.mget("k1","k2","k3","k4","k5"));
		jedis.del("k1","k2");
		System.out.println("删除部分键值对后,jedis获取多个键值对应的value值:"+jedis.mget("k1","k2","k3","k4","k5"));
	}
}
