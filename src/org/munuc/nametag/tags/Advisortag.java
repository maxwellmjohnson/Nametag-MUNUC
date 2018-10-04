package org.munuc.nametag.tags;

import java.util.List;

import org.munuc.nametag.pdfs.TagElement;

public class Advisortag implements Nametag {
	private String name;
	private String school;
	

	@Override
	public void markDone(boolean isDone) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOrganization() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TagType getType() {
		// TODO Auto-generated method stub
		return TagType.ADVISOR;
	}

	@Override
	public List<TagElement> convertToTagElements() {
		// TODO Auto-generated method stub
		return null;
	}

}
