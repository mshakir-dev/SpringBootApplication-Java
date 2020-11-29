package com.mshakir.enterprise.application.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicBusinessService topicBusinessService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicBusinessService.getAllTopicList();
	}
	
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicBusinessService.getTopic(id);
	}

	
}
