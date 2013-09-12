/*
 * @Title: JedisTest.java
 * @Package com.xf.redis
 * @Description: TODO
 * @author xufei1 <xufei1@letv.com>
 * @date 2013-9-12 下午2:35:05
 * @version V1.0
 *
 * Modification History:  
 * Date         Author      Version     Description  
 * -------------------------------------------------------------- 
 * 2013-9-12                          
 */
package com.xf.redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

import junit.framework.TestCase;

/**
 * <p>
 * </p>
 * 
 * @author xufei1 <xufei1@letv.com> Create at:2013-9-12 下午2:35:05
 */
public class JedisTest {
	private static final String ADDRESS = "10.100.54.31";

	@Test
	public void helloTest() {
		Jedis jedis = new Jedis(ADDRESS);
		jedis.set("a", "Hello World !");
		String result = jedis.get("a");
		System.out.println("result:" + result);
	}
}
