package sg.edu.nus.iss.ssf_day12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// inside RestController has ResponseBody which auto converts object into json formatting 
@RestController
@RequestMapping(path = "/api")
public class Controller {

    // return object
    // call this with localhost:portNumber/api/home
    @GetMapping(path = "/home")
    public HelloWorld getHome(){
        return new HelloWorld("Hello World");
    }

    // path variable
    // return what you type after home
    // call this with localhost:portnumber/api/home/<name>
    @GetMapping(path = "/home/{name}")
    public HelloWorld getHome(@PathVariable String name){
        return new HelloWorld(name);
    }

    // same as the path variable method but written in a different way
    @GetMapping(path = "/home")
    public HelloWorld getHome2(@RequestParam String name){
        return new HelloWorld(name);
    }

    // returning simple string 
    // call this with localhost:portNumber/api/peko
    @GetMapping(path = "/peko")
    public String getPeko(){
        return "gibe food plez";
    }
    
}
