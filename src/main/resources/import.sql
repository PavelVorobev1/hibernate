DROP TABLE users IF EXISTS CASCADE ;
CREATE TABLE IF NOT EXISTS users (id bigserial PRIMARY KEY,name VARCHAR(255));
INSERT INTO users (name) VALUES ('Bob'), ('Tom'), ('Mike');

DROP TABLE products IF EXISTS CASCADE ;
CREATE TABLE IF NOT EXISTS products (id bigserial, price int, title VARCHAR(255), PRIMARY KEY (id),user_id bigint REFERENCES users (id));
INSERT INTO products (title, price,user_id) VALUES ('Orange', 30,1), ('Apple', 20,2), ('Banana', 25,3);
