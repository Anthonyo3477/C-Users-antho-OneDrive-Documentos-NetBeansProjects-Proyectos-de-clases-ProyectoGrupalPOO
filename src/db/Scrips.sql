
CREATE DATABASE proyecto_grupal_poo;

CREATE TABLE `auto` (
  `patente` varchar(7) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `año_auto` date NOT NULL,
  `descripcion` varchar(100) NOT NULL
)
ALTER TABLE `auto`
  ADD PRIMARY KEY (`patente`);

CREATE TABLE `admin` (
  `nombre` varchar(100) NOT NULL,
  `rutAdmin` varchar(13) NOT NULL,
  `fechaNacimineto` date NOT NULL,
  `direccion` varchar(300) NOT NULL,
  `telefono` int(13) DEFAULT NULL
)

ALTER TABLE `admin`
  ADD PRIMARY KEY (`rutAdmin`);

CREATE TABLE `cliente` (
  `nombre` varchar(100) NOT NULL,
  `rutCliente` varchar(13) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `direccion` varchar(300) NOT NULL,
  `telefono` int(13) NOT NULL
)

ALTER TABLE `cliente`
  ADD PRIMARY KEY (`rutCliente`);
