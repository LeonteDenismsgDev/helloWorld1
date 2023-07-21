import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/hello-world")
    String home() {
        return "Hello World - v5!";
    }

    @RequestMapping("/hello-world/date")
    String date() {
        return new Date().toString();
    }

    @RequestMapping("/hello-world/vik")
    String salut() {
        return "Salutari perverse de la Vik!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
