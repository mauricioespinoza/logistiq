alter session set "_ORACLE_SCRIPT"=true;
create user Producto identified by 1234;
grant all privileges to Producto;
connect Producto/1234;
ALTER SESSION SET current_schema = Producto;

/*Tabla Categoria producto*/
CREATE TABLE Categoria(
id_categoria NUMBER PRIMARY KEY NOT NULL,
det_categoria VARCHAR(200) NOT NULL);
CREATE SEQUENCE SQ_CATPROD MINVALUE 1 START WITH 1 INCREMENT BY 1 CACHE 10;

/*TABLA Producto */
CREATE TABLE Producto(
idProducto NUMBER PRIMARY KEY NOT NULL,
codigo VARCHAR(50) NOT NULL,
nombre VARCHAR(200) NOT NULL,
precio NUMBER NOT NULL,
stock NUMBER NOT NULL,
descripcion VARCHAR(500),
tipo_producto NUMBER NOT NULL,
FOREIGN KEY (tipo_producto) REFERENCES Categoria(id_categoria));
CREATE SEQUENCE SQ_PRODUCTO MINVALUE 1 START WITH 1 INCREMENT BY 1 CACHE 10;

/*insert categorias*/
INSERT INTO Categoria(id_categoria, det_categoria)
VALUES (SQ_CATPROD.NextVal, 'Tipo prod 1');

INSERT INTO Categoria(id_categoria, det_categoria)
VALUES (SQ_CATPROD.NextVal, 'Tipo prod 2');

INSERT INTO Categoria(id_categoria, det_categoria)
VALUES (SQ_CATPROD.NextVal, 'Tipo prod 3');

/*insert Producto*/
INSERT INTO Producto(idProducto, codigo, nombre, precio, stock, descripcion, tipo_producto)
VALUES (SQ_PRODUCTO.NextVal, 100101, 'Producto 100101', 9990, 100, 'Descripción Producto 100101', 1);

INSERT INTO Producto(idProducto, codigo, nombre, precio, stock, descripcion, tipo_producto)
VALUES (SQ_PRODUCTO.NextVal, 100102, 'Producto 100101', 19990, 100, 'Descripción Producto 100102', 2);

INSERT INTO Producto(idProducto, codigo, nombre, precio, stock, descripcion, tipo_producto)
VALUES (SQ_PRODUCTO.NextVal, 100103, 'Producto 100101', 189990, 100, 'Descripción Producto 100101', 3);

commit;
disconnect;

/*Para eliminar todo (ROLLBACK), descomentar lo siguiente:
drop user Producto cascade;
*/