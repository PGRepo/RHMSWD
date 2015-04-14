package com.rhmswd.service.messaging;

import java.util.Properties;

import kafka.admin.AdminUtils;
import kafka.producer.Producer;
import kafka.producer.ProducerConfig;
import kafka.utils.ZKStringSerializer;

import org.I0Itec.zkclient.ZkClient;

public class MessagingService {
	
	int sessionTimeoutMs = 10000;
	int connectionTimeoutMs = 10000;
	/*ZkClient zkClient = new ZkClient("zookeeper1:2181", sessionTimeoutMs, connectionTimeoutMs,
			    ZKStringSerializer)

			// Create a topic named "myTopic" with 8 partitions and a replication factor of 3
			String topicName = "myTopic";
			int numPartitions = 8;
			int replicationFactor = 3;
			int topicConfig = new Properties;
	
			
			
			
			AdminUtils.createTopic(zkClient, topicName, numPartitions, replicationFactor, topicConfig);
			
			private ProducerConfig kafkaConfig() {
			    Properties props = new Properties();
			    props.put("zk.connect","127.0.0.0.1");
			    //props.put("metadata.broker.list", BROKERS);
			    props.put("serializer.class", "kafka.serializer.StringEncoder");
			    //props.put("request.required.acks", "1");
			    //props.put("message.max.bytes", "" + 1024 * 1024 * 40);
			    ProducerConfig config= new ProducerConfig(props);
			    Producer<String, String> producer = new Producer<String, String>(config);
			    return new ProducerConfig(props);
			    }
			    
*/			

			
			private void createProducer()
			{
				
				
			}
	

}




