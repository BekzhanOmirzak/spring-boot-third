package springbootthird.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping
    public String getString() {
        return "This is a new string from";
    }

    @GetMapping("/users")
    public String getUsers() {
        return "Imagine you are getting the list of users";
    }

    @GetMapping("/posts")
    public String getPosts() {
        return "Imagine you are getting the lise of posts";
    }

    @GetMapping("/girls")
    public String getGirls(){
        return "Imagine you are together with bunch of girls";
    }


}
