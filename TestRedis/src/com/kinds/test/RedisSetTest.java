package com.kinds.test;

import redis.clients.jedis.Jedis;
/*
 * ���ڼ������͵Ĳ���
 * �����е�Ԫ���������ظ�
 * Jedis�й��ڼ��ϵĲ���������s��ͷ��
 */
public class RedisSetTest {
   public static void main(String[] args) {
	 Jedis jedis=new Jedis("localhost");
	 jedis.sadd("kset", "k1","k2","k3","k4","k5","k6","k6");
	 System.out.println("�����е�Ԫ��:"+jedis.smembers("kset"));
	 jedis.srem("kset", "k1");
	 System.out.println("ɾ��һ��Ԫ�غ�:"+jedis.smembers("kset"));
	 jedis.srem("kset", "k2","k3");
	 System.out.println("��ɾ������Ԫ�غ�:"+jedis.smembers("kset"));
	 System.out.println("����Ƴ�һ��Ԫ��:"+jedis.spop("kset"));
	 System.out.println("������Ԫ�ظ���"+jedis.scard("kset"));
	 jedis.sadd("kset", "t1","t2","t8");
	 System.out.println("t1�Ƿ��ڼ�����:"+jedis.sismember("kset", "t1"));
	 System.out.println("t3�Ƿ��ڼ�����:"+jedis.sismember("kset", "t3"));
	 jedis.smove("kset", "wset","t8");
	 System.out.println("��kset�е�Ԫ��ɾ�����ƶ���wset������������Ԫ�ظ���:"+jedis.smembers("kset")+" "+jedis.smembers("wset"));
	 System.out.println("���������еĽ���Ϊ:"+jedis.sinter("kset","wset"));
	 System.out.println("���������еĲ���Ϊ:"+jedis.sunion("kset","wset"));
	 System.out.println("���������еĲΪ:"+jedis.sdiff("kset","wset"));
}
}
