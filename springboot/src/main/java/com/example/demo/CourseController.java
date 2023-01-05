package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/course")
	public List<Course> retriveAll()
	{
		return Arrays.asList(new Course(1,"Java","Abinesh"),new Course(2,"JavaScript","Abisha"));
	}
}
