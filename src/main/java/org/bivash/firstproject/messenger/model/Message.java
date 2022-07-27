package org.bivash.firstproject.messenger.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


  public class Message {
	
	private long id;
	private String Message;
	private Date created;
	private String author;
	private Map<Long,Comment> comments = new HashMap<>();
	private List<Link> links = new ArrayList<>();
	
	public Message() {
		
	}
	public Message(long id, String message,String author) {
		this.id=id;
		this.Message = message;
		this.author=author;
		this.created= new Date();
		
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessages() {
		return Message;
	}
	public void setMessages(String messages) {
		this.Message = messages;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	} 
	
	public  Map<Long, Comment> getComments(){
		return comments;
	}
	public void setComments(Map<Long,Comment> comments) {
		this.comments= comments;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public void addLink(String url,String rel) {
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		links.add(link);
	
	}
	
	

}
