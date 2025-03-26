DROP DATABASE IF EXISTS netology_db;

CREATE DATABASE netology_db;

USE netology_db;

CREATE TABLE IF NOT EXISTS PERSONS
(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    surname VARCHAR(20) NOT NULL,
    age INT,
    phone_number VARCHAR(20) UNIQUE NOT NULL,
    city_of_living VARCHAR(20),
    CONSTRAINT cust_chk_age CHECK (age > 1),
    CONSTRAINT cust_chk_email CHECK (phone_number REGEXP '[+]?[0-9]{1,3} ?\\(?[0-9]{3}\\)? ?[0-9]{2}[0-9 -]+[0-9]{2}')
);