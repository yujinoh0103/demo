package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@RequestMapping("test")
public class TestController {
@GetMapping
public String testController(){
return "Hello World!( 안녕하세요!)"; 
}
@GetMapping("/{id}")
public String testContollerWithPathVariables(@PathVariable(required =false) int
id){
return "Hello World! ID "+ id;
}
@GetMapping("/Param")
public String testContollerRequestParam(@RequestParam(required =false) int id){
return "Hello World! ID param "+ id;
}
}