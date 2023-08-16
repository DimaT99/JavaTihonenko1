package school_online.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/test")
public class TestController {
    @GetMapping
    public String testsPage() {
        return "test";
    }
}
