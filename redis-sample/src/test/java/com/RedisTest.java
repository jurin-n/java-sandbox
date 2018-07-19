package com;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import static org.hamcrest.core.Is.is;

import redis.clients.jedis.Jedis;

public class RedisTest {
	@Test
	public void testAddStringValue() {
		Jedis jedis = new Jedis("localhost");		
		jedis.set("id", "0001");
		assertThat(jedis.get("id"), is("0001"));
	}
}
