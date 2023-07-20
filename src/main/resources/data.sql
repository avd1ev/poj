DELETE FROM excursion;
DELETE FROM users;
DELETE FROM job;
DELETE FROM category;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO category(title)
VALUES
    ('programming'),
    ('driving');

INSERT INTO job(title, category_id)
VALUES
    ('Java Developer', 100000),
    ('Python Developer', 100000),
    ('Taxi driver', 100001),
    ('Truck driver', 100001);

INSERT INTO users(first_name, last_name, email, password, phone, job_id)
VALUES
    ('Victor', 'Avdeev', 'avdeev10v@gmail.com', '1234', '+380687180419', 100002),
    ('Petro', 'Klubok', 'petro@gmail.com', '1234', '+380687180410', 100003),
    ('Vasyl', 'Table', 'table@gmail.com', '1234', '+380687180411', 100005),
    ('Inokentiy', 'Jenkin', 'inokentiy@gmail.com', '1234', '+380687180412', null);

INSERT INTO excursion(user_id)
VALUES
    (100006);
