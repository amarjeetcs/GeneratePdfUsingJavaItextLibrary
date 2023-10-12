package com.pdf.PdfGenerateProject;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;

public class App1 {
	public static void main(String args[]) throws Exception {
		// Creating a PdfDocument object
		String dest = "addingTable.pdf";
		PdfWriter writer = new PdfWriter(dest);

		// Creating a PdfDocument object
		PdfDocument pdf = new PdfDocument(writer);

		// Creating a Document object
		Document doc = new Document(pdf);

		// Creating a table
		float[] pointColumnWidths = { 100F, 100F, 100F,100F,100F };
		Table table = new Table(pointColumnWidths);

		// Adding cells to the table
		table.addCell(new Cell().add("Name").setBold());
		table.addCell(new Cell().add("Amarjeet Singh"));
		table.addCell(new Cell().add("Company").setBold());
		table.addCell(new Cell().add("Freelance"));
		table.addCell(new Cell().add("Designation").setBold());
		table.addCell(new Cell().add("Programmer"));
		
		
		table.addCell(new Cell().add("Name").setBold());
		table.addCell(new Cell().add("Rajnish Singh"));
		table.addCell(new Cell().add("Company").setBold());
		table.addCell(new Cell().add("L&T"));
		table.addCell(new Cell().add("Designation").setBold());
		table.addCell(new Cell().add("Programmer"));
		
		table.addCell(new Cell().add("Name").setBold());
		table.addCell(new Cell().add("Vishujeet Singh"));
		table.addCell(new Cell().add("Company").setBold());
		table.addCell(new Cell().add("Mahindra"));
		table.addCell(new Cell().add("Designation").setBold());
		table.addCell(new Cell().add("Mechanical Engineer"));
		
		table.addCell(new Cell().add("Name").setBold());
		table.addCell(new Cell().add("Sanjeet Srivastva"));
		table.addCell(new Cell().add("Company").setBold());
		table.addCell(new Cell().add("Aimdek"));
		table.addCell(new Cell().add("Designation").setBold());
		table.addCell(new Cell().add("Programmer"));
		
		table.addCell(new Cell().add("Name").setBold());
		table.addCell(new Cell().add("Raju"));
		table.addCell(new Cell().add("Company").setBold());
		table.addCell(new Cell().add("Mahindra"));
		table.addCell(new Cell().add("Designation").setBold());
		table.addCell(new Cell().add("Helper"));

		// Adding Table to document
		doc.add(table);

		// Closing the document
		doc.close();
		System.out.println("Table created successfully..");
	}
}
