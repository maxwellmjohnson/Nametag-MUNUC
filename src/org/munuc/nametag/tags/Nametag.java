package org.munuc.nametag.tags;

import java.util.List;

import org.munuc.nametag.pdfs.TagElement;

public interface Nametag {
	public void markDone(boolean isDone);
	public String getName();
	public String getOrganization();
	public TagType getType();
	public List<TagElement> convertToTagElements();
}
