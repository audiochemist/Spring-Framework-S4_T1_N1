package cat.itacademy.barcelonactiva.medina.german.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String saluda(@RequestParam(value = "name", defaultValue = "unknown") String name){

        return "Hello, " + name + ". You're running a Maven project.";
    }
    @GetMapping({"/helloworld2", "/helloworld2/{name}"})
    public String saluda2(@PathVariable(required = false) String name) {

        return "Hello, " + name + ". You're running a Maven project.";
    }


}
