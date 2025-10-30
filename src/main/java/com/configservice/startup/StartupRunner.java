package com.configservice.startup;

import com.configservice.service.IpMappingPublisherService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    private final IpMappingPublisherService publisherService;

    public StartupRunner(IpMappingPublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @Override
    public void run(String... args) {
        System.out.println("Running initial Couchbase sync on startup...");
        publisherService.publishIpMappings();
    }
}

