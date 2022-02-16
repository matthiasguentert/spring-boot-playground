package io.azureblue.springbootplayground;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = "someQueue")
    public void processMessage(String content) {
        System.out.println(content);
    }
}
