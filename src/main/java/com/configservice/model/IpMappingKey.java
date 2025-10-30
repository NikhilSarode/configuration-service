package com.configservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class IpMappingKey implements Serializable {

    @Column(name = "from_ip")
    private Long fromIp;

    @Column(name = "to_ip")
    private Long toIp;

    public IpMappingKey() {}

    public IpMappingKey(Long fromIp, Long toIp) {
        this.fromIp = fromIp;
        this.toIp = toIp;
    }

    public Long getFromIp() { return fromIp; }
    public void setFromIp(Long fromIp) { this.fromIp = fromIp; }

    public Long getToIp() { return toIp; }
    public void setToIp(Long toIp) { this.toIp = toIp; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IpMappingKey)) return false;
        IpMappingKey that = (IpMappingKey) o;
        return Objects.equals(fromIp, that.fromIp) &&
                Objects.equals(toIp, that.toIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromIp, toIp);
    }
}
