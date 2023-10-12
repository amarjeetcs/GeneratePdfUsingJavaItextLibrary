package com.pdf.PdfGenerateProject;

import java.io.FileNotFoundException;
import java.lang.annotation.ElementType;

import javax.lang.model.element.Element;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.element.Paragraph;

public class App {
	static public void main(String args[]) throws Exception {
		
		
		App app=new App();
		app.generatePdf();
		
		

	}
	public void generatePdf() throws FileNotFoundException
	{
		
		//String path = "C:\\Users\\USER\\Desktop\\Hac\\generatePdf.pdf";
		String path = "generatePdf.pdf";
		PdfWriter pdfWriter = new PdfWriter(path);
		PdfDocument pdfDocument = new PdfDocument(pdfWriter);
		pdfDocument.setDefaultPageSize(PageSize.A4);
		// Document(PageSize.A4.rotate(), 10f, 10f, 100f, 0f);
		Document document = new Document(pdfDocument);

		float twocol = 300f;
		float twocol150 = twocol + 150f;
		float twocolumnWidth[] = { twocol150, twocol, twocol, twocol };

		Paragraph paragraph = new Paragraph("FINAL REPORT Version 1");
		paragraph.setTextAlignment(TextAlignment.CENTER);

		document.add(paragraph);
		document.add(new Paragraph("DATE: 20.03.2023"));
		document.add(new Paragraph("AUDIT DONE BY"));

		float[] pointColumnWidths = { 50f, 250f, 100f, 100f };
		Table table = new Table(pointColumnWidths);

		// Adding cells to the table
		table.addCell(new Cell().add("NO"));
		table.addCell(new Cell().add("DESCRIPTION"));
		table.addCell(new Cell().add("RESULT"));
		table.addCell(new Cell().add("REMARK"));

		Cell c1 = new Cell(); 
		c1.add("A"); 
		table.addCell(c1);
		
		Cell c2 = new Cell(); // Creating cell 1
		c2.add("WHEREHOUSE RELATED"); 
		table.addCell(c2);
		
		
		Cell c3 = new Cell(); 
		c3.add(""); 
		table.addCell(c3);
		
		Cell c4 = new Cell(); 
		c4.add(""); 
		table.addCell(c4);
		
		Cell c5 = new Cell(); 
		c5.add("1"); 
		table.addCell(c5);
		
		Cell c6 = new Cell(); 
		c6.add("WHETHER QR CODE").add("UPDATED BY RM IS").add("MATCHING WITH QR CODE").add("IN WAREHOUSE"); 
		table.addCell(c6);
		
		Cell c7 = new Cell(); 
		c7.add(""); 
		table.addCell(c7);
		
		Cell c8 = new Cell(); 
		c8.add(""); 
		table.addCell(c8);
		
		Cell c9 = new Cell(); 
		c9.add("2"); 
		table.addCell(c9);
		
		Cell c10 = new Cell(); 
		c10.add("FULL ADDRESS OF WAREHOUSE"); 
		table.addCell(c10);
		
		Cell c11 = new Cell(); 
		c11.add(""); 
		table.addCell(c11);
		
		Cell c12 = new Cell(); 
		c12.add(""); 
		table.addCell(c12);
		
		Cell c13 = new Cell(); 
		c13.add("3"); 
		table.addCell(c13);
		
		Cell c14 = new Cell(); 
		c14.add("NAME OF THE BORROWER (S)"); 
		table.addCell(c14);
		
		Cell c15 = new Cell(); 
		c15.add(""); 
		table.addCell(c15);
		
		Cell c16 = new Cell(); 
		c16.add(""); 
		table.addCell(c16);
			
		Cell c17 = new Cell(); 
		c17.add("4"); 
		table.addCell(c17);
		
		Cell c18 = new Cell(); 
		c18.add("NAME OF THE CM"); 
		table.addCell(c18);
		
		Cell c19 = new Cell(); 
		c19.add(""); 
		table.addCell(c19);
		
		Cell c20 = new Cell(); 
		c20.add(""); 
		table.addCell(c20);
		
		Cell c21 = new Cell(); 
		c21.add("5"); 
		table.addCell(c21);
		
		Cell c22 = new Cell(); 
		c22.add("TYPE OF STRUCTURE"); 
		table.addCell(c22);
		
		Cell c23 = new Cell(); 
		c23.add(""); 
		//c23.setBorder(Border.NO_BORDER);    
		table.addCell(c23);
		
		Cell c24 = new Cell(); 
		c24.add(""); 
		//c24.setBorder(Border.NO_BORDER);    
		table.addCell(c24);
		document.add(table);
		document.close();
	}
	

}