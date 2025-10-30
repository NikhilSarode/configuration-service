package com.configservice.kafka;

import com.common.ConfigUpdateEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import java.time.Instant;

@Service
public class ConfigEventPublisher {
    private final KafkaTemplate<String, ConfigUpdateEvent> kafka;
    public ConfigEventPublisher(KafkaTemplate<String, ConfigUpdateEvent> kafka){ this.kafka = kafka; }
    public void publishGeoIp() {
        ConfigUpdateEvent ev = new ConfigUpdateEvent("GEOIP");
        kafka.send("config-updates", "GEOIP", ev);
        System.out.println("Published GEOIP update event");
    }
}