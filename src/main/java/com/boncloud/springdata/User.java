package com.boncloud.springdata;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(value="user")
public class User {
	
	@PrimaryKey(value="id")
	private String id;
	
	@Column(value="first_name")
	private String firstName;
	
	@Column(value="last_name")
	private String lastName;


	
	
	

}
