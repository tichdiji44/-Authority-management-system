package online.sjzy.authority.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public Object hello() {
        return "Hello Mango!";
    }
}
