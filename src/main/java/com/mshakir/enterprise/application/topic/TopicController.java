package com.mshakir.enterprise.application.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		Topic t1 = new Topic("xs100", "Spring Framework", "It will allow to create enterprise based application", "Java", 1000);
		Topic t2 = new Topic("xs200", "Spring Boot", "It will allow to create enterprise application already added configuration in stand-alone", "Java", 2000);
		List<Topic> topics = new ArrayList<Topic>();
		topics.add(t1);
		topics.add(t2);
		return topics;
	}
	
}
