package com.spring.web.hibCS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.web.hibCS.dao.Bookdao;
import com.spring.web.hibCS.entity.Book;

@Controller
public class BookController 
{

	Bookdao bdao;
	
	@Autowired
	BookController(Bookdao bdao)
	{
		this.bdao=bdao;
	}
	@RequestMapping("/bookPage")
	public String getBookPage(Model model)
	{
		model.addAttribute("book",new Book(0," ",0.0," "));
		return "DisplayBook";
	}
	@RequestMapping("/bookCRUD")
	public String bookCrud(@RequestParam("sub")String sub,@RequestParam("bookid")int bookid,@RequestParam("booktitle")String booktitle,@RequestParam("price")double price,@RequestParam("author")String author,RedirectAttributes ra)
	{
		ra.addFlashAttribute("book",new Book(bookid,booktitle,price,author));
		String val=" ";
		if(sub.equals("Add_Book")) val="addBook";
		else if(sub.equals("Del_Book")) val="deleteBook";
		else if(sub.equals("Mod_Book")) val="modifyBook";
		else val="getBook";
		return "redirect:"+val;
	}
	@RequestMapping("/addBook")
	public String addBook(@ModelAttribute("book")Book b)
	{
		bdao.insertBook(new Book(b.getBookid(),b.getBooktitle(),b.getPrice(),b.getAuthor()));
		return "DisplayBook";
	}
	@RequestMapping("/modifyBook")
	public String modifyBook(@ModelAttribute("book")Book b)
	{
		bdao.modifyBook(new Book(b.getBookid(),b.getBooktitle(),b.getPrice(),b.getAuthor()));
		return "DisplayBook";
	}
	@RequestMapping("/deleteBook")
	public String deleteBook(@ModelAttribute("book")Book b)
	{
		bdao.deleteBook(b.getBookid());
		return "DisplayBook";
	}
	@RequestMapping("/getBook")
	public String getBook(@ModelAttribute("book")Book b,Model model)
	{
		Book b1= bdao.getBook(b.getBookid());
		model.addAttribute("book",b1);
		return "DisplayBook";
		
	}
}


