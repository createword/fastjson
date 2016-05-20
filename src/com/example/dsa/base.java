package com.example.dsa;

import com.alibaba.fastjson.annotation.JSONField;

public class base {
	private String name;

	@JSONField(name = "XM")
	public String getName() {
		return name;
	}

	@JSONField(name = "XM")
	public void setName(String name) {
		this.name = name;
	}

	@JSONField(name = "NL")
	public String getAge() {
		return age;
	}

	@JSONField(name = "NL")
	public void setAge(String age) {
		this.age = age;
	}

	private String age;
}
