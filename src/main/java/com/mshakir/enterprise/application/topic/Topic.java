package com.mshakir.enterprise.application.topic;

public class Topic {
	private String id;
	private String name;
	private String description;
	private String language;
	private int code;

	public Topic() {
	}

	public Topic(String id, String name, String description, String language, int code) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.language = language;
		this.code = code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", description=" + description + ", language=" + language
				+ ", code=" + code + "]";
	}

}
