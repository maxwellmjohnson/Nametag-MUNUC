package org.munuc.nametag.tags;

public enum TagType {
	ADVISOR("Advisor"),
	MEMBER("Member"),
	DELEGATE("DELEGATE");
	
	private final String type;
	
	TagType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
