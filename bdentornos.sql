-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-06-2023 a las 13:54:52
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdentornos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `adulto_responsable`
--

CREATE TABLE `adulto_responsable` (
  `dni_responsable` varchar(9) NOT NULL,
  `cod_evento` int(11) NOT NULL,
  `nombre_responsable` varchar(100) NOT NULL,
  `apellidos_responsable` varchar(100) NOT NULL,
  `tfno_responsable` int(11) DEFAULT NULL,
  `correo_responsable` varchar(100) DEFAULT NULL,
  `fecha_nac_responsable` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistentes`
--

CREATE TABLE `asistentes` (
  `cod_asistente` int(11) NOT NULL,
  `cod_evento` int(11) NOT NULL,
  `nombre_asistente` varchar(100) NOT NULL,
  `asistente_presente` varchar(1) DEFAULT NULL CHECK (`asistente_presente` in ('s','n')),
  `alergias_asistente` varchar(100) DEFAULT NULL,
  `id_menu` int(11) DEFAULT NULL,
  `color_pulsera` varchar(100) DEFAULT NULL,
  `edad_asistente` int(11) NOT NULL,
  `taquilla_asistente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `asistentes`
--

INSERT INTO `asistentes` (`cod_asistente`, `cod_evento`, `nombre_asistente`, `asistente_presente`, `alergias_asistente`, `id_menu`, `color_pulsera`, `edad_asistente`, `taquilla_asistente`) VALUES
(1002, 1, 'David', 'n', 'Marisco', 0, NULL, 12, 2),
(1003, 2, 'Elena', 'n', NULL, 1, NULL, 17, 1),
(1004, 2, 'Jorge', 'n', NULL, 2, NULL, 18, 2),
(1005, 2, 'Laura', 'n', NULL, 1, NULL, 19, 3),
(1006, 2, 'Miguel', 'n', 'Huevo', 1, NULL, 20, 4),
(1007, 2, 'Sofía', 'n', NULL, 2, NULL, 21, 5),
(1008, 2, 'Daniel', 'n', 'Huevo', 2, NULL, 22, 6),
(1009, 2, 'Lucía', 'n', NULL, 2, NULL, 23, 7),
(1010, 2, 'Álvaro', 'n', 'Cacahuete', 1, NULL, 24, 8),
(1011, 2, 'Marta', 'n', NULL, 1, NULL, 25, 9),
(1012, 2, 'Pablo', 'n', 'Kiwi', 1, NULL, 26, 10),
(1013, 3, 'Leo', 'n', 'Celíaco', 4, NULL, 6, 1),
(1014, 3, 'Sara', 'n', 'Vegetariana', 3, NULL, 7, 2),
(1015, 3, 'Lucas', 'n', NULL, 1, NULL, 8, 3),
(1016, 3, 'Eva', 'n', NULL, 1, NULL, 5, 4),
(1017, 3, 'Mateo', 'n', 'Celíaco', 4, NULL, 6, 5),
(1018, 3, 'Lola', 'n', NULL, 1, NULL, 7, 6),
(1019, 3, 'Hugo', 'n', 'Vegetariano', 3, NULL, 8, 7),
(1020, 4, 'Lucía', 'n', NULL, 0, NULL, 11, 1),
(1021, 4, 'Miguel', 'n', 'Frutos secos', 0, NULL, 12, 2),
(1022, 5, 'Ana', 'n', NULL, 2, NULL, 25, 1),
(1023, 5, 'Carlos', 'n', 'Gluten', 4, NULL, 27, 2),
(1024, 5, 'Elena', 'n', 'Lactosa', 1, NULL, 24, 3),
(1025, 5, 'David', 'n', NULL, 2, NULL, 26, 4),
(1026, 5, 'Laura', 'n', 'Marisco', 2, NULL, 28, 5),
(1027, 5, 'Jorge', 'n', NULL, 2, NULL, 23, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento`
--

CREATE TABLE `evento` (
  `id_evento` int(11) NOT NULL,
  `id_animador` int(11) NOT NULL,
  `fecha_evento` datetime NOT NULL,
  `precio_evento` double DEFAULT NULL,
  `n_asistentes_evento` int(11) DEFAULT NULL,
  `hora_entrada` varchar(100) DEFAULT NULL,
  `hora_salida` varchar(100) DEFAULT NULL,
  `tipo_evento` varchar(100) NOT NULL,
  `sabor_tarta` varchar(400) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `evento`
--

INSERT INTO `evento` (`id_evento`, `id_animador`, `fecha_evento`, `precio_evento`, `n_asistentes_evento`, `hora_entrada`, `hora_salida`, `tipo_evento`, `sabor_tarta`) VALUES
(2, 5, '0000-00-00 00:00:00', 300, 10, '20:00', '23:00', 'FIESTA', 'Chocolate'),
(3, 4, '0000-00-00 00:00:00', 150, 7, '17:00', '19:00', 'CUMPLEAÑOS', 'Fresa'),
(4, 3, '0000-00-00 00:00:00', 10, 2, '18:00', '20:00', 'LIBRE', NULL),
(5, 5, '0000-00-00 00:00:00', 250, 6, '21:00', '00:00', 'FIESTA', 'Chocolate');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menu`
--

CREATE TABLE `menu` (
  `id_menu` int(11) NOT NULL,
  `nombre_menu` varchar(100) DEFAULT NULL,
  `precio_menu` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `menu`
--

INSERT INTO `menu` (`id_menu`, `nombre_menu`, `precio_menu`) VALUES
(1, 'Menú infantil', 9.99),
(2, 'Menú adulto', 12.99),
(3, 'Menú vegano', 11.99);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

CREATE TABLE `trabajador` (
  `dni_trabajador` varchar(9) NOT NULL,
  `id_trabajador` double NOT NULL,
  `nombre_trabajador` varchar(100) NOT NULL,
  `apellidos_trabajador` varchar(100) NOT NULL,
  `rol_trabajador` varchar(100) NOT NULL,
  `sueldo_trabajador` double DEFAULT NULL,
  `cc_trabajador` varchar(100) DEFAULT NULL,
  `direccion_trabajador` varchar(100) DEFAULT NULL,
  `ss_trabajador` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `trabajador`
--

INSERT INTO `trabajador` (`dni_trabajador`, `id_trabajador`, `nombre_trabajador`, `apellidos_trabajador`, `rol_trabajador`, `sueldo_trabajador`, `cc_trabajador`, `direccion_trabajador`, `ss_trabajador`) VALUES
('12345678B', 6, 'Carlos', 'García López', 'DISEÑO', 1500, 'ES91 2345 6789 0123 4567', 'Calle Larga, 15', 61234567890),
('23456789C', 7, 'María', 'López Sánchez', 'PROGRAMACION', 1800, 'ES92 3456 7890 1234 5678', 'Calle Ancha, 25', 62345678901),
('23456789X', 2, 'Juan', 'Martínez López', 'COCINA', 1500, 'ES34 5678 9012 3456 7890', 'Calle Menor, 15', 37234567890),
('34567890D', 8, 'Pedro', 'Sánchez Pérez', 'ANIMACION', 1200, 'ES93 4567 8901 2345 6789', 'Calle Estrecha, 35', 63456789012),
('34567890Y', 3, 'Sara', 'Rodríguez Sánchez', 'ANIMACION', 1200, 'ES56 7890 1234 5678 9012', 'Calle Media, 20', 46345678901),
('45678901E', 9, 'Ana', 'Pérez García', 'DISEÑO', 1500, 'ES94 5678 9012 3456 7890', 'Calle Curva, 45', 64567890123),
('45678901Z', 4, 'David', 'Gómez Fernández', 'ANIMACION', 1200, 'ES78 9012 3456 7890 1234', 'Calle Larga, 25', 55456789012),
('56789012A', 5, 'Elena', 'Pérez García', 'ANIMACION', 1200, 'ES90 1234 5678 9012 3456', 'Calle Corta, 30', 64567890123),
('56789012F', 10, 'Luis', 'García López', 'PROGRAMACION', 1800, 'ES95 6789 0123 4567 8901', 'Calle Recta, 55', 65678901234);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asistentes`
--
ALTER TABLE `asistentes`
  ADD PRIMARY KEY (`cod_asistente`);

--
-- Indices de la tabla `evento`
--
ALTER TABLE `evento`
  ADD PRIMARY KEY (`id_evento`);

--
-- Indices de la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD PRIMARY KEY (`dni_trabajador`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
