package com.mkyong;

import java.io.FileInputStream;
import java.util.List;

public class App 
{
	// read epub file
	EpubReader epubReader = new EpubReader();
	Book book = epubReader.readEpub(new FileInputStream("mybook.epub"));
	
	// print the first title
	List<String> titles = book.getMetadata().getTitles();
	System.out.println("book title:" + (titles.isEmpty() ? "book has no title" : titles.get(0)));
	
}
