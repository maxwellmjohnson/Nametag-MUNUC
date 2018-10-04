package org.munuc.nametag.pdfs;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class DrawingUtils {
	
	public static final float INCH = 72;
	public static float PAGE_WIDTH; //will be effectively final
	public static float PAGE_HEIGHT; 

	
	static {
		PAGE_WIDTH = (new PDPage()).getMediaBox().getWidth();
		PAGE_WIDTH = (new PDPage()).getMediaBox().getHeight();
	}
	
	public static float center(String text, PDFont font, float fontsize, float width) {
		
		try {
			float textWidth = font.getStringWidth(text) / 1000 * 12;
		    return (width-textWidth)/2;

		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static PDPage renderPageToDocument(PDDocument doc, Page page) {
		PDPage toRender = new PDPage();
		doc.addPage(toRender);
		page.render();
		try {
			PDPageContentStream contentStream = new PDPageContentStream(doc, toRender);
			for (TagElement element : page.getTagElements()) {
				if (element instanceof TextElement) {
					contentStream.beginText(); 
			    	contentStream.setFont(element.getFont(), element.getFontSize());
			    	contentStream.newLineAtOffset(element.getLocation().getWidth(), element.getLocation().getHeight());
			    	contentStream.showText(((TextElement)element).getText());
			    	contentStream.endText();
				}


			}		    
		    contentStream.close();

		    System.out.println("Content added");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return toRender;
	}

}
