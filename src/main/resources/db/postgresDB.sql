CREATE TABLE IF NOT EXISTS Receta (
  id_receta INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  nombre VARCHAR(255),
  descripcion TEXT,
  tiempo_de_preparacion double precision,
  instruccion_de_preparacion TEXT,
  dificultad INT,
  id_categoria INT,
  imagen bytea
);

CREATE TABLE IF NOT EXISTS Categoria (
  id_categoria INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  nombre VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Ingrediente (
  id_ingrediente INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  nombre VARCHAR(255),
  medida VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Ingrediente_receta (
  id_ingrediente_receta INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  id_receta INT,
  id_ingrediente INT
);

CREATE TABLE IF NOT EXISTS Comentarios (
  id_comentarios INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  id_receta INT,
  nombre_autor VARCHAR(255),
  fecha DATE,
  comentario TEXT
);

CREATE TABLE IF NOT EXISTS Usuario (
  id_usuario INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  nombre VARCHAR(255),
  contrasena VARCHAR(255),
  correo_electronico VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Favorito (
  id_favorito INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  favorito BOOLEAN,
  id_usuario INT,
  id_receta INT
);

ALTER TABLE IF EXISTS Receta ADD FOREIGN KEY (id_categoria) REFERENCES Categoria (id_categoria);

ALTER TABLE IF EXISTS Ingrediente_receta ADD FOREIGN KEY (id_receta) REFERENCES Receta (id_receta);

ALTER TABLE IF EXISTS Ingrediente_receta ADD FOREIGN KEY (id_ingrediente) REFERENCES Ingrediente (id_ingrediente);

ALTER TABLE IF EXISTS Comentarios ADD FOREIGN KEY (id_receta) REFERENCES Receta (id_receta);

ALTER TABLE IF EXISTS Favorito ADD FOREIGN KEY (id_usuario) REFERENCES Usuario (id_usuario);

ALTER TABLE IF EXISTS Favorito ADD FOREIGN KEY (id_receta) REFERENCES Receta (id_receta);


--- insertar datos de prueba
INSERT INTO Categoria (nombre) VALUES ('Desayuno');
INSERT INTO Categoria (nombre) VALUES ('Almuerzo');
INSERT INTO Categoria (nombre) VALUES ('Cena');
INSERT INTO Categoria (nombre) VALUES ('Postre');

-- eliminar datos de prueba
DELETE FROM Categoria WHERE id_categoria > 4;

-- insertar datos de prueba admin
INSERT INTO Usuario (nombre, contrasena, correo_electronico) VALUES ('admin', 'admin', 'admin@gmail.com');
