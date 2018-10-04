package org.munuc.nametag.tags;

import java.util.ArrayList;
import java.util.List;

import org.munuc.nametag.pdfs.TagElement;
import org.munuc.nametag.pdfs.TextElement;

public class Delegatetag implements Nametag {
	private String name;
	private String com;
	private String role;
	private String school;
	
	public Delegatetag(String name, String com, String role, String school) {
		this.name = name;
		this.role = role;
		this.school = school;
		this.com = com;
	}

	@Override
	public void markDone(boolean isDone) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getOrganization() {
		return this.school;
	}

	@Override
	public TagType getType() {
		return TagType.DELEGATE;
	}

	@Override
	public List<TagElement> convertToTagElements() {
		List<TagElement> elements = new ArrayList<TagElement>();
		
		TagElement tagName = new TextElement(name, 0, 0, null, 0);
		
		return null;
	}
	
}
