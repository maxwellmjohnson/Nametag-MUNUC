package org.munuc.nametag.pdfs;

public class TagElementLocation {
	
	private float w;
	private float h;
	
	public TagElementLocation(float w, float h) {
		this.w = w;
		this.h = h;
	}
	
	public float getWidth() {
		return w;
	}
	
	public float getHeight() {
		return h;
	}
	
	public void adjust(float w, float h) {
		this.w += w;
		this.h += h;
	}
	
}
