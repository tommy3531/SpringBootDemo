package hello;

import com.example.demo.DemoApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController extends DemoApplication {

    @RequestMapping("/")
    public String index() {

        return "Greetings from Spring Boot!";
    }
}
