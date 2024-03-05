CREATE DATABASE  IF NOT EXISTS `user_directory`;
USE `user_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
   `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `user` VALUES
	(1,'Leslie','Andrews','Leslie','leslie@luv2code.com'),
	(2,'Emma','Baumgarten','Emma','emma@luv2code.com'),
	(3,'Avani','Gupta','Avani','avani@luv2code.com'),
	(4,'Yuri','Petrov','Yuri','yuri@luv2code.com'),
	(5,'Juan','Vega','Juan','juan@luv2code.com');

