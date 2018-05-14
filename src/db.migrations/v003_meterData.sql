CREATE TABLE meters (
  id      INT NOT NULL PRIMARY KEY,
  api_key VARCHAR(64) UNIQUE
);

CREATE TABLE meter_data (
  id         BIGINT      NOT NULL PRIMARY KEY,
  meter_id   INT         NOT NULL,
  value_type VARCHAR(32) NOT NULL,
  value      DOUBLE PRECISION,
  time       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  FOREIGN KEY (meter_id) REFERENCES meters (id)
);