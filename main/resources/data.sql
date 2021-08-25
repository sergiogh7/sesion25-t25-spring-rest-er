DROP TABLE IF EXISTS fabricante;
DROP TABLE IF EXISTS articulo;

CREATE TABLE fabricante(
codigo INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100)
);

INSERT INTO fabricante (nombre) VALUES ('fabricante Audi');
INSERT INTO fabricante (nombre) VALUES ('fabricante Seat');
INSERT INTO fabricante (nombre) VALUES ('fabricante Lamborghini');
INSERT INTO fabricante (nombre) VALUES ('fabricante Ford');
INSERT INTO fabricante (nombre) VALUES ('fabricante Ferrari');

CREATE TABLE articulo(
codigo INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100),
precio INT(20),
codigo_fabricante INT,
FOREIGN KEY (codigo_fabricante) REFERENCES fabricante (codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO articulo (nombre, precio, codigo_fabricante) VALUES ('Producto 1', 115, 1);
INSERT INTO articulo (nombre, precio, codigo_fabricante)  VALUES ('Producto 2', 176, 2);
INSERT INTO articulo (nombre, precio, codigo_fabricante)  VALUES ('Producto 3', 375, 3);
INSERT INTO articulo (nombre, precio, codigo_fabricante)  VALUES ('Producto 4', 98, 4);
INSERT INTO articulo (nombre, precio, codigo_fabricante)  VALUES ('Producto 5', 666, 5);