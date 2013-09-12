/*
 * @Title: RedisHello.java
 * @Package com.xf.redis.demo
 * @Description: TODO
 * @author xufei1 <xufei1@letv.com>
 * @date 2013-9-12 下午2:27:16
 * @version V1.0
 *
 * Modification History:  
 * Date         Author      Version     Description  
 * -------------------------------------------------------------- 
 * 2013-9-12                          
 */
package com.xf.redis.demo;

import redis.clients.jedis.Jedis;

/** 
 * <p></p>
 * 
 * @author xufei1 <xufei1@letv.com>
 * Create at:2013-9-12 下午2:27:16
 */
public class RedisHello {
	private static final String ADDRESS = "10.100.54.31";
	/** 
	 * 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Jedis jedis = new Jedis(ADDRESS);
		jedis.set("a", "Hello World !");
		String result = jedis.get("a");
		System.out.println("result:"+result);
		
	}

}
