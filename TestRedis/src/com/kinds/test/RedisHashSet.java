package com.kinds.test;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

/*
 * ����redis�Ĺ�ϣ����
 * hmset�����洢valueֵΪmap��
 * ��ϣ�Ĳ���������h��ͷ
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
	    jedis.hset("haha", "k5", "v5");//������ָ��λ�ô�������ֵ��
	    System.out.println("ɢ��haha�����м�ֵ��:"+jedis.hgetAll("haha"));
	    System.out.println("ɢ��haha������keyֵΪ:"+jedis.hkeys("haha"));
	    System.out.println("ɢ��haha�����м�ֵ��:"+jedis.hvals("haha"));
	    jedis.hincrBy("haha", "k6", 6);//��k6��Ӧ��valֵ��6����������k6����ô���Զ����k6
	    System.out.println("ɢ��haha�����м�ֵ��:"+jedis.hgetAll("haha"));
	    System.out.println("ɢ��ɾ��һ��������ֵ��:"+jedis.hdel("haha", "k2"));
	    System.out.println("ɢ��haha�����м�ֵ��:"+jedis.hgetAll("haha"));
	    System.out.println("ɢ��haha�ļ�ֵ�Ը���:"+jedis.hlen("haha"));
	    System.out.println("�ж�hash���Ƿ����key3:"+jedis.hexists("haha","k3"));
	    System.out.println("�ж�hash���Ƿ����key2:"+jedis.hexists("haha","k2"));
	    System.out.println("�ж�hash��key3��ֵ:"+jedis.hmget("haha","k3"));
	    System.out.println("�ж�hash��key3��key4��ֵ:"+jedis.hmget("haha","k3","k4"));
	    
	}
}
