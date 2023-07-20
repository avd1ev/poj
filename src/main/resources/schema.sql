DROP TABLE IF EXISTS excursion;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS job;
DROP TABLE IF EXISTS category;

CREATE TABLE category
(
    id INTEGER PRIMARY KEY,
    title VARCHAR NOT NULL
);

CREATE TABLE job
(
    id INTEGER PRIMARY KEY,
    title VARCHAR NOT NULL,
    category_id INTEGER NOT NULL,
    FOREIGN KEY (category_id) REFERENCES category(id)
);

CREATE TABLE users
(
    id INTEGER PRIMARY KEY,
    first_name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    email VARCHAR NOT NULL,
    password VARCHAR NOT NULL,
    phone VARCHAR NOT NULL,
    job_id INTEGER NOT NULL,
    FOREIGN KEY (job_id) REFERENCES job(id)
);

CREATE TABLE excursion
(
    id INTEGER PRIMARY KEY,
    user_id INTEGER NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id)
);