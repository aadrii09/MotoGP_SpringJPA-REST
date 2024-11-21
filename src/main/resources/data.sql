
/* ENUNCIADO
1-crear entities de las 3 tablas
2-establecer las relaciones entre las tablas usando spring data
3-crear un CRUD para los 3 entities(cuando veamos un objeto piloto queremos ver en que carreras ha participado e información de los circuitos)
4-crear un método que nos devuelva que pilotos hicieron pódium
5-crear un método que nos devuelva que pilotos hicieron pódium y en que carrera y temporada
6-crear un método que calcule quien quedo de primero mas veces
7-crear un endpoint que sea /circuitos/nombreCircuito */




/* INSERT INTO piloto (id, nombre, conducción) VALUES
(1, 'Marc Márquez', 'agresiva'),
(2, 'Valentino Rossi', 'temeraria'),
(3, 'Fabio Quartararo', 'pasiva'),
(4, 'Francesco Bagnaia', 'agresiva'),
(5, 'Joan Mir', 'pasiva'),
(6, 'Jack Miller', 'temeraria'),
(7, 'Maverick Viñales', 'agresiva'),
(8, 'Aleix Espargaró', 'pasiva'),
(9, 'Brad Binder', 'agresiva'),
(10, 'Enea Bastianini', 'temeraria');

INSERT INTO circuito (id, nombre, localidad) VALUES
(1, 'Losail', 'Catar'),
(2, 'Termas de Río Hondo', 'Argentina'),
(3, 'Austin', 'Estados Unidos'),
(4, 'Jerez', 'España'),
(5, 'Le Mans', 'Francia'),
(6, 'Mugello', 'Italia'),
(7, 'Assen', 'Países Bajos'),
(8, 'Red Bull Ring', 'Austria'),
(9, 'Misano', 'San Marino'),
(10, 'Phillip Island', 'Australia');

INSERT INTO carreras (id, id_piloto, id_circuito, temporada, posición) VALUES
(1, 1, 1, '2023', 3),
(2, 2, 1, '2023', 5),
(3, 3, 1, '2023', 1),
(4, 4, 2, '2023', 4),
(5, 5, 2, '2023', 7),
(6, 6, 2, '2023', 2),
(7, 7, 3, '2023', 6),
(8, 8, 3, '2023', 9),
(9, 9, 3, '2023', 12),
(10, 10, 4, '2023', 11),
(11, 1, 4, '2023', 8),
(12, 2, 5, '2023', 4),
(13, 3, 5, '2023', 2),
(14, 4, 6, '2023', 1),
(15, 5, 6, '2023', 10),
(16, 6, 7, '2023', 3),
(17, 7, 7, '2023', 5),
(18, 8, 8, '2023', 7),
(19, 9, 8, '2023', 6),
(20, 10, 9, '2023', 8),
(21, 1, 9, '2023', 4),
(22, 2, 10, '2023', 2),
(23, 3, 10, '2023', 1),

(24, 1, 1, '2024', 2),
(25, 2, 2, '2024', 6),
(26, 3, 3, '2024', 3),
(27, 4, 4, '2024', 7),
(28, 5, 5, '2024', 1),
(29, 6, 6, '2024', 4),
(30, 7, 7, '2024', 8),
(31, 8, 8, '2024', 5),
(32, 9, 9, '2024', 9),
(33, 10, 10, '2024', 2),
(34, 1, 2, '2024', 3),
(35, 2, 3, '2024', 7),
(36, 3, 4, '2024', 1),
(37, 4, 5, '2024', 2),
(38, 5, 6, '2024', 6),
(39, 6, 7, '2024', 4),
(40, 7, 8, '2024', 10),
(41, 8, 9, '2024', 5),
(42, 9, 10, '2024', 8),
(43, 10, 1, '2024', 9),
(44, 1, 3, '2024', 1),
(45, 2, 5, '2024', 3),
(46, 3, 7, '2024', 2),
(47, 4, 9, '2024', 6); */