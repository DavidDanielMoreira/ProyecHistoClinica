-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-02-2024 a las 04:34:29
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdhclinica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidades`
--

CREATE TABLE `especialidades` (
  `idEspe` int(10) UNSIGNED NOT NULL,
  `nombreEspe` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `especialidades`
--

INSERT INTO `especialidades` (`idEspe`, `nombreEspe`) VALUES
(1, 'Alergología'),
(2, 'Anestesiologia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hclinicas`
--

CREATE TABLE `hclinicas` (
  `idHist` int(10) UNSIGNED NOT NULL,
  `fechaHist` date DEFAULT NULL,
  `nombreHist` varchar(8) COLLATE utf8_spanish_ci DEFAULT NULL,
  `idPaci` int(10) UNSIGNED NOT NULL,
  `idMedi` int(10) UNSIGNED NOT NULL,
  `tratamientoHist` text COLLATE utf8_spanish_ci,
  `fechaHistUlt` date DEFAULT NULL,
  `estadoHist` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `hclinicas`
--

INSERT INTO `hclinicas` (`idHist`, `fechaHist`, `nombreHist`, `idPaci`, `idMedi`, `tratamientoHist`, `fechaHistUlt`, `estadoHist`) VALUES
(1, '2024-01-30', '19777222', 1, 1, ' La Diabetes tipo 1. Tu páncreas no produce insulina o produce muy poca. La Insulina es una hormona que ayuda\n a que la azúcar en la sangre entre entre a las células del cuerpo, donde se puede usar como fuente de energia.\nEs una enfermedad de por vida para la cual aún no tiene cura.\nSin la insulina, hay un exceso de glucosa que permanece en la sangre pueden causarle problemas serios \nen el corazón, los ojos, los riñones, los nervios, las encias y los dientes.\nLa diabetes tipo 1 ocurre con mayor frecuencia en los niños y adultos jóvenes, pero puede aparecer a cualquier edad. Los\nsintomas pueden incluir: mucha sed, orinar frecuentemente, sentir mucha hambre y cansancio.\n', '2024-01-30', 1),
(2, '2024-02-15', '19000222', 2, 1, 'Probando insertar Historia Clinica Nº2.\nPrabando editar.', '2024-02-15', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicos`
--

CREATE TABLE `medicos` (
  `idMedi` int(10) UNSIGNED NOT NULL,
  `apellidoMedi` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `nombresMedi` varchar(60) COLLATE utf8_spanish_ci DEFAULT NULL,
  `domicilioMedi` varchar(90) COLLATE utf8_spanish_ci DEFAULT NULL,
  `dniMedi` varchar(8) COLLATE utf8_spanish_ci DEFAULT NULL,
  `sexoMedi` varchar(1) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fechaNacMedi` date DEFAULT NULL,
  `telefonoMedi` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL,
  `idEspe` int(10) UNSIGNED NOT NULL,
  `estadoMedi` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `medicos`
--

INSERT INTO `medicos` (`idMedi`, `apellidoMedi`, `nombresMedi`, `domicilioMedi`, `dniMedi`, `sexoMedi`, `fechaNacMedi`, `telefonoMedi`, `idEspe`, `estadoMedi`) VALUES
(1, 'Rondina ', 'Sergio', 'Alvear 200', '20444111', 'M', '1971-10-03', '03414444', 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `idPaci` int(10) UNSIGNED NOT NULL,
  `apellidoPaci` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `nombresPaci` varchar(60) COLLATE utf8_spanish_ci DEFAULT NULL,
  `domicilioPaci` varchar(80) COLLATE utf8_spanish_ci DEFAULT NULL,
  `dniPaci` varchar(8) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tipoSangrePaci` varchar(3) COLLATE utf8_spanish_ci DEFAULT NULL,
  `sexoPaci` varchar(1) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fechaNacPaci` date DEFAULT NULL,
  `telefonoPaci` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL,
  `estadoPaci` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`idPaci`, `apellidoPaci`, `nombresPaci`, `domicilioPaci`, `dniPaci`, `tipoSangrePaci`, `sexoPaci`, `fechaNacPaci`, `telefonoPaci`, `estadoPaci`) VALUES
(1, 'Funes', 'Roberto', 'Belgrano 555', '19777222', 'A+', 'M', '1970-05-12', '020202', 1),
(2, 'Bielsa', 'Hugo', 'Formosa 3456', '19000222', 'B+', 'M', '1970-02-26', '3400651111', 1),
(3, 'Sosa', 'Carlos', 'Formosa 110', '21555000', 'A+', 'M', '2024-02-16', '-', 1),
(4, 'Matosas', 'Carlos', 'Av Dorrego 1100', '25211211', NULL, NULL, '1977-02-03', '-', 0),
(5, 'Diaz', 'Alonso', 'Belgrano 1516', '23852852', 'A-', 'M', '1975-02-05', '-', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `especialidades`
--
ALTER TABLE `especialidades`
  ADD PRIMARY KEY (`idEspe`);

--
-- Indices de la tabla `hclinicas`
--
ALTER TABLE `hclinicas`
  ADD PRIMARY KEY (`idHist`),
  ADD UNIQUE KEY `nombreHisto` (`nombreHist`),
  ADD KEY `idPaci` (`idPaci`),
  ADD KEY `idMedi` (`idMedi`);

--
-- Indices de la tabla `medicos`
--
ALTER TABLE `medicos`
  ADD PRIMARY KEY (`idMedi`),
  ADD UNIQUE KEY `dniMedi` (`dniMedi`),
  ADD KEY `idEspe` (`idEspe`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`idPaci`),
  ADD UNIQUE KEY `dniPaci` (`dniPaci`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `especialidades`
--
ALTER TABLE `especialidades`
  MODIFY `idEspe` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `hclinicas`
--
ALTER TABLE `hclinicas`
  MODIFY `idHist` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `medicos`
--
ALTER TABLE `medicos`
  MODIFY `idMedi` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `idPaci` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `hclinicas`
--
ALTER TABLE `hclinicas`
  ADD CONSTRAINT `hclinicas_ibfk_1` FOREIGN KEY (`idPaci`) REFERENCES `pacientes` (`idPaci`),
  ADD CONSTRAINT `hclinicas_ibfk_2` FOREIGN KEY (`idMedi`) REFERENCES `medicos` (`idMedi`);

--
-- Filtros para la tabla `medicos`
--
ALTER TABLE `medicos`
  ADD CONSTRAINT `medicos_ibfk_1` FOREIGN KEY (`idEspe`) REFERENCES `especialidades` (`idEspe`),
  ADD CONSTRAINT `medicos_ibfk_2` FOREIGN KEY (`idEspe`) REFERENCES `especialidades` (`idEspe`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
