package com.configservice.service;

import com.configservice.kafka.ConfigEventPublisher;
import com.configservice.repository.IpMappingRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service
public class IpMappingPublisherService {

    private final IpMappingRepository repository;
    private final ConfigEventPublisher evPublisher;

    public IpMappingPublisherService(IpMappingRepository repository, ConfigEventPublisher evPublisher) {
        this.repository = repository;
        this.evPublisher = evPublisher;
    }

    // Runs every minute
    @Scheduled(cron = "0 * * * * *")
    public void publishIpMappings() {
        //Assume DB got updated
        System.out.println("ConfigService: publishing GEOIP update event");
        evPublisher.publishGeoIp();
    }
}
