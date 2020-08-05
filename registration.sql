CREATE TABLE
    product
    (
        id BIGINT NOT NULL,
		serial_number VARCHAR,
		item_name VARCHAR,
		purchase_price NUMERIC,
		purchase_date DATETIME,
		customer_name VARCHAR,
        customer_email VARCHAR,
        customer_phone VARCHAR,
        customer_address VARCHAR,
        PRIMARY KEY (id)
    );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO product (id, serial_number, item_name, purchase_price, purchase_date, customer_name, customer_email, customer_phone, customer_address)
  VALUES (1, 'QWERTVBHF2', 'WATCH', '1200', '2016-01-01 10:20:05.123', 'Naveen', '', '8978459032', 'Jalandhar G.T. Road Punjab');

INSERT INTO hibernate_sequence (next_val) VALUES (2);
