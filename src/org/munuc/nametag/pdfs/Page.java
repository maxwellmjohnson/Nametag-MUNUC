package org.munuc.nametag.pdfs;

import java.util.List;

public interface Page {
	
	public List<TagElement> getTagElements();
	public void render();


}
