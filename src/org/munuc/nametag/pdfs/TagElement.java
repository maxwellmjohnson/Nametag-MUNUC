package org.munuc.nametag.pdfs;

import org.apache.pdfbox.pdmodel.font.PDFont;

public interface TagElement {
	public TagElementLocation getLocation();
	public TagElement adjustLocation(float w, float h);
	public PDFont getFont();
	public float getFontSize();
}
