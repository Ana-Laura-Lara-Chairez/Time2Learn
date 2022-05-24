-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-10-2019 a las 03:49:15
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `time2learn`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puntaje`
--

CREATE TABLE `puntaje` (
  `Id_Puntaje` int(11) NOT NULL,
  `Nombre` text NOT NULL,
  `Animales` text NOT NULL,
  `DiasSemana` text NOT NULL,
  `Adjetivos` text NOT NULL,
  `Adivinanzas` text NOT NULL,
  `Profesiones` text NOT NULL,
  `CincoSentidos` text NOT NULL,
  `Emociones` text NOT NULL,
  `Meses` text NOT NULL,
  `Ropa` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `puntaje`
--

INSERT INTO `puntaje` (`Id_Puntaje`, `Nombre`, `Animales`, `DiasSemana`, `Adjetivos`, `Adivinanzas`, `Profesiones`, `CincoSentidos`, `Emociones`, `Meses`, `Ropa`) VALUES
(1, 'Maria', '4', '2', '1', '4', '0', '', '', '', ''),
(2, 'Alonso', '2', '2', '5', '2', '0', '', '', '', ''),
(3, 'Felipe', '2', '2', '2', '3', '0', '', '', '', ''),
(4, 'Osvaldo', '2', '2', '2', '4', '1', '', '', '', ''),
(5, 'Alicia', '2', '1', '2', '2', '1', '', '', '', ''),
(6, 'Sofia', '0', '3', '2', '1', '1', '', '', '', ''),
(7, 'Juan', '2', '2', '3', '4', '1', '', '', '', ''),
(8, 'Daniel', '5', '1', '4', '3', '1', '', '', '', ''),
(9, 'Diego', '0', '3', '4', '4', '1', '', '', '', ''),
(10, 'Paulina', '7', '7', '5', '4', '1', '0', '0', '0', '0'),
(11, 'Josh', '0', '0', '0', '0', '0', '0', '0', '0', '0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `Id_Registro` int(11) NOT NULL,
  `Nombre` text NOT NULL,
  `Edad` int(11) NOT NULL,
  `Genero` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`Id_Registro`, `Nombre`, `Edad`, `Genero`) VALUES
(1, 'Maria', 8, 'Niña'),
(2, 'Alonso', 8, 'Niño'),
(3, 'Felipe', 6, 'Niño'),
(4, 'Osvaldo', 9, 'Niño'),
(5, 'Alicia', 8, 'Niña'),
(6, 'Sofia', 8, 'Niña'),
(7, 'Juan', 6, 'Niño'),
(8, 'Daniel', 8, 'Niño'),
(9, 'Diego', 8, 'Niño'),
(10, 'Paulina', 7, 'Niña'),
(11, 'Josh', 8, 'Niño');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `puntaje`
--
ALTER TABLE `puntaje`
  ADD PRIMARY KEY (`Id_Puntaje`);

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`Id_Registro`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `puntaje`
--
ALTER TABLE `puntaje`
  MODIFY `Id_Puntaje` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=143;
--
-- AUTO_INCREMENT de la tabla `registro`
--
ALTER TABLE `registro`
  MODIFY `Id_Registro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
