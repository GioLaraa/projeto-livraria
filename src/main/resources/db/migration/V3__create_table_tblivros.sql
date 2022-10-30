CREATE TABLE `tbusuarios` (
  `login` int(9) NOT NULL,
  `senha` varchar(15) DEFAULT NULL,
  `nome` varchar(129) DEFAULT NULL,
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;