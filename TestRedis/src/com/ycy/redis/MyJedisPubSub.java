package com.ycy.redis;

import redis.clients.jedis.Client;
import redis.clients.jedis.JedisPubSub;

public class MyJedisPubSub extends JedisPubSub {
	@Override
	public void onMessage(String channel, String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		super.onMessage(channel, message);
	}

	@Override
	public void proceed(Client client, String... channels) {
		// TODO Auto-generated method stub
		super.proceed(client, channels);
	}
}
