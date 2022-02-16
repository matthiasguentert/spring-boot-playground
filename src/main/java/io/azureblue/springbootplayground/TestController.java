package io.azureblue.springbootplayground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    private final Producer producer;

    public TestController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping
    public void sendMessage() {
        this.producer.sendMessage("foobar");
    }
}
