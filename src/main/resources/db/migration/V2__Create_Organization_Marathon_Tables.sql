CREATE TABLE IF NOT EXISTS organizations (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255),
    education_institution VARCHAR(255),
    headquarter_country VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS marathons (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    weight INT NOT NULL,
    score DOUBLE NOT NULL
);

CREATE TABLE IF NOT EXISTS members_marathons (
    member_id BIGINT NOT NULL,
    marathon_id BIGINT NOT NULL,
    PRIMARY KEY (member_id, marathon_id),
    FOREIGN KEY (member_id) REFERENCES members(id),
    FOREIGN KEY (marathon_id) REFERENCES marathons(id)
);