package com.github.fabiosilva458.todo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {

	
    @javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
    
    @Column
    private String description;
	
    @Column 
    private Boolean done;
    
    @Column
    private LocalDateTime creatDate;
    
    @Column
    private LocalDateTime doneDate;
    
    
    
    
    
}
