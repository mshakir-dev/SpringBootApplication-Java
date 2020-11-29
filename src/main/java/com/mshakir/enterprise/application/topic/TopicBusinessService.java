package com.mshakir.enterprise.application.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicBusinessService {
	
	Topic t1 = new Topic("xs200", "Spring Boot", "It will allow to create enterprise application already added configuration in stand-alone", "Java", 2000);
	Topic t2 = new Topic("xs100", "Spring Framework", "It will allow to create enterprise based application", "Java", 1000);
	Topic t3 = new Topic("xs300", "Django Python", "It will allow to create enterprise based application", "Python", 3000);
	private List<Topic> topics = new ArrayList<Topic>();
	
	public List<Topic> getAllTopicList() {
		topics.add(t1);
		topics.add(t2);
		topics.add(t3);
		return topics;
	}
	
	public Topic getTopic (String id) {
		return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}

	public void addTopicItem(Topic topic) {
		topics.add(topic);
	}
	
}
