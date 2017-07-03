package com.kinds.test;

import redis.clients.jedis.Jedis;
/*
 * 关于集合类型的测试
 * 集合中的元素是无序不重复
 * Jedis中关于集合的操作都是以s开头的
 */
public class RedisSetTest {
   public static void main(String[] args) {
	 Jedis jedis=new Jedis("localhost");
	 jedis.sadd("kset", "k1","k2","k3","k4","k5","k6","k6");
	 System.out.println("集合中的元素:"+jedis.smembers("kset"));
	 jedis.srem("kset", "k1");
	 System.out.println("删除一个元素后:"+jedis.smembers("kset"));
	 jedis.srem("kset", "k2","k3");
	 System.out.println("又删除两个元素后:"+jedis.smembers("kset"));
	 System.out.println("随机移除一个元素:"+jedis.spop("kset"));
	 System.out.println("集合中元素个数"+jedis.scard("kset"));
	 jedis.sadd("kset", "t1","t2","t8");
	 System.out.println("t1是否在集合中:"+jedis.sismember("kset", "t1"));
	 System.out.println("t3是否在集合中:"+jedis.sismember("kset", "t3"));
	 jedis.smove("kset", "wset","t8");
	 System.out.println("将kset中的元素删除并移动到wset中两个集合中元素个数:"+jedis.smembers("kset")+" "+jedis.smembers("wset"));
	 System.out.println("两个集合中的交集为:"+jedis.sinter("kset","wset"));
	 System.out.println("两个集合中的并集为:"+jedis.sunion("kset","wset"));
	 System.out.println("两个集合中的差集为:"+jedis.sdiff("kset","wset"));
}
}
