package com.mshakir.enterprise.application.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicBusinessService topicBusinessService;
	
	@RequestMapping(value="/topics")
	public List<Topic> getAllTopics() {
		return topicBusinessService.getAllTopicList();
	}
	
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicBusinessService.getTopic(id);
	}

	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicBusinessService.addTopicItem(topic); 
	}
	
	@PutMapping(value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicBusinessService.updateTopicItem(id, topic);
	}
	
	@DeleteMapping(value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicBusinessService.deleteTopicItem(id);
	}

}
