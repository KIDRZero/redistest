package com.kinds.test;

import java.util.List;

import redis.clients.jedis.Jedis;

/*
 * Redis的列表测试
 * 这里的mylist代表的是列表的意思，
 * 一个列表可以存放多个元素
 */
public class RedisListTest {
   public static void main(String[] args) {
	Jedis jedis=new Jedis("localhost");
	jedis.lpush("mylist","自如");
	jedis.lpush("mylist","链家");
	jedis.lpush("mylist","我爱我家");
	List<String> list=jedis.lrange("mylist", 0, 2);
	
	for (String string : list) {
		System.out.println(string);
	}
	for(int i=0;i<list.size();i++){
		System.out.println("列表中存放的项为: "+list.get(i));
	}
	System.out.println("=========");
//     jedis.lpush("qqqqqqlist","a");
//     jedis.lpush("qqqqqqlist","b");
//     jedis.lpush("qqqqqqlist","c");
     System.out.println(jedis.lrange("qqqqqqlist",0,-1));//倒叙输出cbd
     System.out.println(jedis.lrange("qqqqqqlist",0,-2));//cb
     System.out.println(jedis.lrange("qqqqqqlist",0,-3));//c
     System.out.println(jedis.lpop("qqqqqqlist"));
     
}
}
