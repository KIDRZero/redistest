package com.ycy.redis;

import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;
import com.ycy.redis.*;
/*
 * ���������ַ�ʽ���в�ͨ�ģ��ӵ���Ҫ��
 * ��jedis����Ƶ��ʱ��������״̬���޷�������Ϣ�������յ�
 * ��ʹ��main�����ٴ���һ��jedis��Ҳ���в�ͨ�ģ���Ҫ������main�����ֱ𴴽�jedis
 * 
 */
public class TestSubPub {
	 
    public static void main(String[] args) {
    	 MyJedisPubSub m=new MyJedisPubSub();
		Jedis jedis=new Jedis("localhost");
		
		jedis.subscribe(m, "mychannel");
		//jedis.publish("mychannel", "hello xiaomi");	
	//	Jedis jedis2=new Jedis("localhost");
	//	jedis2.publish("mychannel", "hello moto");
	}
   
}
