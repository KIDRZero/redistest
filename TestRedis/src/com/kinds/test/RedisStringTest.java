package com.kinds.test;

import redis.clients.jedis.Jedis;
/*
 * jedis���ַ�������
 */
public class RedisStringTest {
    public static void main(String[] args) {
		Jedis jedis=new Jedis("localhost");
		jedis.set("xxxx", "yyyy");
		System.out.println("jedis��xxxx���key�д洢��ֵΪ===>"+jedis.get("xxxx"));
		jedis.set("t2", "v2");
		jedis.set("t3", "v3");
		System.out.println("ɾ����t2(ɾ���ɹ�����1):"+jedis.del("t2"));
		System.out.println("��ȡ��t2��Ӧ��valueֵ:"+jedis.get("t2"));
		jedis.set("t3", "v3v3");
		System.out.println("�޸ĺ�t3��valueֵΪ:"+jedis.get("t3"));
		jedis.append("t3", "hello");//׷��
		System.out.println("��t3��Ӧ��value׷��ֵ:"+jedis.get("t3"));
		jedis.mset("k1","v1","k2","v2","k3","v3","k4","v4","k5","v5");
		System.out.println("jedis��ȡ�����ֵ��Ӧ��valueֵ:"+jedis.mget("k1","k2","k3","k4","k5"));
		jedis.del("k1","k2");
		System.out.println("ɾ�����ּ�ֵ�Ժ�,jedis��ȡ�����ֵ��Ӧ��valueֵ:"+jedis.mget("k1","k2","k3","k4","k5"));
	}
}
