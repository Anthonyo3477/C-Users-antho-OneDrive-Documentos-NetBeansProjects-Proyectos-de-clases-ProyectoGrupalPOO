
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