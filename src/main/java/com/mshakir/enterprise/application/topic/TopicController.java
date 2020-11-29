package com.mshakir.enterprise.application.topic;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
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

	
}
