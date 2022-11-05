CREATE TABLE `tblivros` (
  `codlivro` int(5) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(255) DEFAULT NULL,
  `autor` varchar(150) DEFAULT NULL,
  `categoria` varchar(40) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  PRIMARY KEY (`codlivro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;