package springbootstarter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    //@RequestMapping defined in the class level maps a specific request path or pattern to a controller.
    public String sayHi(){
        return "Hello 3"
            + "Hello 4" 
            + "Hello there"
            + "Hello there 2";
    }
}
