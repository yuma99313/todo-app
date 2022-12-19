package com.example.demo.entity;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Task {
	private int id;
	
	@NotBlank(message = "※タイトルを省略することはできません")
	private String title;
	
	@NotBlank(message = "※省略することはできません")
	private String detail;
	
	@NotNull(message = "※締切日を省略することはできません")
	private Date end_time;
	
	private Integer user_id;
}
