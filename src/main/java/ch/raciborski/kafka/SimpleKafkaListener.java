package ch.raciborski.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SimpleKafkaListener {

    @KafkaListener(topics = "${sourceTopic}")
    public void listener(String record, Acknowledgment ack) {
        log.debug("Listener received {}.", record);
        ack.acknowledge();
    }
}
