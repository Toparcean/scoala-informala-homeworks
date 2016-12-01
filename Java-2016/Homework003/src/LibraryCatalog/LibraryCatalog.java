package LibraryCatalog;

import java.util.ArrayList;

import Model.ArtAlbum;
import Model.Book;
import Model.Novel;

public class LibraryCatalog {
	
	ArrayList<Book> bookList=new ArrayList<Book>();
	
	public void addBook(Book book){
		bookList.add(book);
	}
	
	public void deleteBook(Book book){
		bookList.remove(book);
	}
	
	public void listBook(){
		for (Book item: bookList){
			System.out.println("Book name:"+ item.getName());
			System.out.println("Number of pages:"+ item.getBookPages());
			if(item instanceof Novel){
				System.out.println("Book type:"+ ((Novel)item).getType());
			}else if(item instanceof ArtAlbum){
				System.out.println("Paper Quality:"+ ((ArtAlbum)item).getPaperQuality());
			}
		}
	}
	
}
