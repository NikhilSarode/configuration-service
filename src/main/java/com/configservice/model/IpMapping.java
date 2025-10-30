package com.configservice.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ip_mappings")
public class IpMapping {

    @EmbeddedId
    private IpMappingKey key;

    private String country;
    private String state;

    public IpMappingKey getKey() { return key; }
    public void setKey(IpMappingKey key) { this.key = key; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
}

