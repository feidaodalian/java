package com.xf.rabbitmq.official.demo;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

public class NewTaskWorkQueues {

	  private static final String TASK_QUEUE_NAME = "task_queue";

	  public static void main(String[] argv) 
	                      throws java.io.IOException {

	    ConnectionFactory factory = new ConnectionFactory();
	    factory.setHost("115.47.37.182");
	    Connection connection = factory.newConnection();
	    Channel channel = connection.createChannel();

	    channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);

	    String message = "sender alls";

	    channel.basicPublish( "", TASK_QUEUE_NAME, 
	            MessageProperties.PERSISTENT_TEXT_PLAIN,
	            message.getBytes());
	    System.out.println(" [x] Sent '" + message + "'");

	    channel.close();
	    connection.close();
	  }      
	  //...
	}