package com.example.restservice.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.example.restservice.exception.InvalidInputException;

@Entity
@EntityListeners(AuditingEntityListener.class)

public class Reminder {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name = "title", length = 50, nullable = false)
	    private String title;

	    @Column(name = "date", nullable = false)
	    private Date date;


	  public Integer getId() {
	        return id;
	    }

	  public void setId(Integer id) {
	        this.id = id;
	    }

	  public String getTitle() {
	        return title;
	    }
		
		/*
		 * @param title is a String object with a max length of 50.
		 */
	  public void setTitle(String title) throws InvalidInputException {
		  if(!checkTitle(title))
			  throw new InvalidInputException ("The title should contain max 50 characters.");
	        this.title = title;
	    }

	  public Date getDate() {
	        return date;
	    }
		
		/*
		 * @param date should be in the format of "yyyy-MM-dd'T'HH:mm:ss.SSSz"
		 */
	  public void setDate(Date date) {
	        this.date = date;
	    }
	  
	  private static boolean checkTitle(String title) {
		  return (title.length() < 51);
	  }

}
