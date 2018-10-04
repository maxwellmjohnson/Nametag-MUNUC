package org.munuc.nametag.customimplementations;

import java.util.ArrayList;
import java.util.List;

import org.munuc.nametag.pdfs.DrawingUtils;
import org.munuc.nametag.pdfs.Page;
import org.munuc.nametag.pdfs.TagElement;
import org.munuc.nametag.tags.Nametag;

public class MUNUCPage implements Page {
	
	private final int TAG_COUNT = 6;
	private final int TAG_ROW = 2;
	private final float WBORDER = DrawingUtils.INCH;
	private final float HBORDER = DrawingUtils.INCH;
	private final float CARD_WIDTH = (DrawingUtils.PAGE_WIDTH-2*WBORDER)/TAG_ROW;
	private final float CARD_HEIGHT = (DrawingUtils.PAGE_HEIGHT-2*HBORDER)/(TAG_COUNT/TAG_ROW);


	
	private Nametag[] tags;
	private List<TagElement> rendered;

	
	public MUNUCPage() {
		tags = new Nametag[TAG_COUNT];
	}
	
	public void addTag(Nametag tag) {
		for (int i = 0; i < TAG_COUNT; i++) {
			if (tags[i]==null) {
				tags[i] = tag;
			}
		}
	}
	
	public void render() {
		rendered = new ArrayList<TagElement>();
		for (int i = 0; i < TAG_COUNT; i++) {
			Nametag tag = tags[i];
			float wcursor = WBORDER+(i%TAG_ROW)*CARD_WIDTH;
			float hcursor = HBORDER + (i%(TAG_COUNT/TAG_ROW))*CARD_HEIGHT;
			for (TagElement e : tag.convertToTagElements()) {
				if (e!=null) {
					rendered.add(e.adjustLocation(wcursor,hcursor));
				}
			}
		}
	}
	
	@Override
	public List<TagElement> getTagElements() {
		return rendered;
	}
	
}
