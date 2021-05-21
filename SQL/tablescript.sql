SELECT * FROM pokemon.generation;CREATE TABLE `generation` (
  `id` int NOT NULL AUTO_INCREMENT,
  `generationnumber` int DEFAULT NULL,
  `generationnumeral` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `pokemon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `attack` int DEFAULT NULL,
  `defense` int DEFAULT NULL,
  `generation` int DEFAULT NULL,
  `hp` int DEFAULT NULL,
  `legendary` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pokedexNumber` int DEFAULT NULL,
  `specialAttack` int DEFAULT NULL,
  `specialDefense` int DEFAULT NULL,
  `speed` int DEFAULT NULL,
  `total` int DEFAULT NULL,
  `type1` varchar(255) DEFAULT NULL,
  `type2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=803 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `type` (
  `id` int NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


