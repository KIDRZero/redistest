package com.kinds.test;

import java.util.List;

import redis.clients.jedis.Jedis;

/*
 * Redis���б����
 * �����mylist��������б����˼��
 * һ���б���Դ�Ŷ��Ԫ��
 */
public class RedisListTest {
   public static void main(String[] args) {
	Jedis jedis=new Jedis("localhost");
	jedis.lpush("mylist","����");
	jedis.lpush("mylist","����");
	jedis.lpush("mylist","�Ұ��Ҽ�");
	List<String> list=jedis.lrange("mylist", 0, 2);
	
	for (String string : list) {
		System.out.println(string);
	}
	for(int i=0;i<list.size();i++){
		System.out.println("�б��д�ŵ���Ϊ: "+list.get(i));
	}
	System.out.println("=========");
//     jedis.lpush("qqqqqqlist","a");
//     jedis.lpush("qqqqqqlist","b");
//     jedis.lpush("qqqqqqlist","c");
     System.out.println(jedis.lrange("qqqqqqlist",0,-1));//�������cbd
     System.out.println(jedis.lrange("qqqqqqlist",0,-2));//cb
     System.out.println(jedis.lrange("qqqqqqlist",0,-3));//c
     System.out.println(jedis.lpop("qqqqqqlist"));
     
}
}
