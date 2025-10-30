CREATE TABLE ip_mappings (
  from_ip BIGINT NOT NULL,
  to_ip BIGINT NOT NULL,
  country VARCHAR(100),
  state VARCHAR(100),
  PRIMARY KEY (from_ip, to_ip)
) ENGINE=InnoDB;
