package org.munuc.nametag.pdfs;

import org.apache.pdfbox.pdmodel.font.PDFont;

public class TextElement implements TagElement {
	
	private TagElementLocation location;
	private String text;
	private PDFont font;
	private float fontsize;
	
	public TextElement(String text, float width, float height, PDFont font, float fontsize) {
		this.text = text;
		this.font = font;
		this.fontsize = fontsize;
		this.location = new TagElementLocation(width,height);
	}
	
	@Override
	public TagElementLocation getLocation() {
		return location;
	}
	
	public String getText() {
		return text;
	}
	
	public PDFont getFont() {
		return font;
	}
	
	public float getFontSize() {
		return fontsize;
	}

	@Override
	public TagElement adjustLocation(float w, float h) {
		location.adjust(w, h);
		return this;
	}
	
	
}
