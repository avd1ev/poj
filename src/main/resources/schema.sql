DROP TABLE IF EXISTS excursion;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS job;
DROP TABLE IF EXISTS category;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 100000;

CREATE TABLE category
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    title VARCHAR NOT NULL
);

CREATE TABLE job
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    title VARCHAR NOT NULL,
    category_id INTEGER NOT NULL,
    FOREIGN KEY (category_id) REFERENCES category(id)
);

CREATE TABLE users
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    first_name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    email VARCHAR NOT NULL,
    password VARCHAR NOT NULL,
    phone VARCHAR NOT NULL,
    job_id INTEGER,
    FOREIGN KEY (job_id) REFERENCES job(id)
);

CREATE TABLE excursion
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    user_id INTEGER NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id)
);