docnumber INT  NOT NULL );

SET FOREIGN_KEY_CHECKS = 0;

-- Drop all tables
DROP TABLE IF EXISTS FACTURA_DETALLES;
DROP TABLE IF EXISTS FACTURA;
DROP TABLE IF EXISTS PRODUCTOS;
DROP TABLE IF EXISTS CLIENTE;

SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE CLIENTE (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(75) NOT NULL,
    lastname VARCHAR(75) NOT NULL,
    docnumber VARCHAR(11) NOT NULL
);

CREATE TABLE PRODUCTOS (
    id INT PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(150) NOT NULL,
    code VARCHAR(50) NOT NULL,
    stock int NOT NULL,
    price double NOT NULL
);

CREATE TABLE FACTURA (
    id INT PRIMARY KEY AUTO_INCREMENT,
    client_id INT,
    created_at DATETIME,
    total DOUBLE,
    FOREIGN KEY (cliente_id) REFERENCES CLIENTE(id)
);

CREATE TABLE RECIBO_DETALLES (
    id INT PRIMARY KEY AUTO_INCREMENT,
    invoice_id INT,
    amount INT,
    product_id INT,
    price DOUBLE,
    FOREIGN KEY (recibo_id) REFERENCES recibo(id),
    FOREIGN KEY (producto_id) REFERENCES producto(id)
);