package com.configservice.repository;

import com.configservice.model.IpMapping;
import com.configservice.model.IpMappingKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpMappingRepository extends JpaRepository<IpMapping, IpMappingKey> {
}
