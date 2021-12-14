DROP TABLE IF EXISTS turbo_order;
CREATE TABLE turbo_order (
                         id   INTEGER      NOT NULL AUTO_INCREMENT,
                         rappi_id   INTEGER      NOT NULL AUTO_INCREMENT,
                         name_rt VARCHAR(128) NOT NULL,
                         status INTEGER NOT NULL,
                         PRIMARY KEY (id)
);