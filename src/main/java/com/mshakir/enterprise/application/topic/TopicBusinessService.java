package com.mshakir.enterprise.application.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicBusinessService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("xs200", "Spring Boot", "It will allow to create enterprise application already added configuration in stand-alone", "Java", 2000),
			new Topic("xs100", "Spring Framework", "It will allow to create enterprise based application", "Java", 1000),
			new Topic("xs300", "Django Python", "It will allow to create enterprise based application", "Python", 3000)
			));
	
	public List<Topic> getAllTopicList() {
		return topics;
	}
	
	public Topic getTopic (String id) {
		return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}

	public void addTopicItem(Topic topic) {
		topics.add(topic);
	}

	public void updateTopicItem(String id, Topic topic) {
		for (int i = 0; i <topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i,  topic);
				return;
			}
		}
	}

	public void deleteTopicItem(String id) {
		topics.removeIf(t-> t.getId().equals(id));
	}

	
}
