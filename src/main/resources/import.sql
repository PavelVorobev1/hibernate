DROP TABLE users IF EXISTS;
CREATE TABLE IF NOT EXISTS users (id bigserial, price int, title VARCHAR(255), PRIMARY KEY (id));
INSERT INTO products (title, price) VALUES ('Orange', 30), ('Apple', 20), ('Banana', 25);
