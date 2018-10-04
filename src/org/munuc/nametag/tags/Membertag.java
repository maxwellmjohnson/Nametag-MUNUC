package org.munuc.nametag.tags;

import java.util.List;

import org.munuc.nametag.pdfs.TagElement;

public class Membertag implements Nametag {
	private String name;
	private String role;
	
	public Membertag(String name, String role) {
		
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
		return "MUNUC"; //TODO munuc year
	}

	@Override
	public TagType getType() {
		return TagType.MEMBER;
	}

	@Override
	public List<TagElement> convertToTagElements() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
