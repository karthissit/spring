package org.classes.engnie;

import org.springframework.stereotype.Component;

@Component
public class V3 {
	
	String type;
	
	public V3() {
		type  = "V3";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
