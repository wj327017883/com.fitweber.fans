-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema fitweber
--

CREATE DATABASE IF NOT EXISTS fitweber;
USE fitweber;

--
-- Definition of table `phonecard`
--

DROP TABLE IF EXISTS `phonecard`;
CREATE TABLE `phonecard` (
  `id` varchar(32) NOT NULL,
  `userId` varchar(32) NOT NULL,
  `phoneNumber` varchar(11) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_phonecard_1` (`userId`),
  CONSTRAINT `FK_phonecard_1` FOREIGN KEY (`userId`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `phonecard`
--

/*!40000 ALTER TABLE `phonecard` DISABLE KEYS */;
INSERT INTO `phonecard` (`id`,`userId`,`phoneNumber`) VALUES 
 ('1','1','13794037251');
/*!40000 ALTER TABLE `phonecard` ENABLE KEYS */;


--
-- Definition of table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL auto_increment,
  `psw` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `student`
--

/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`,`psw`,`name`) VALUES 
 (1,'2222','11');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;


--
-- Definition of table `telephonenumber`
--

DROP TABLE IF EXISTS `telephonenumber`;
CREATE TABLE `telephonenumber` (
  `id` varchar(32) NOT NULL,
  `visitCardId` varchar(32) NOT NULL,
  `telephoneNumber` varchar(11) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_telephonenumber_1` (`visitCardId`),
  CONSTRAINT `FK_telephonenumber_1` FOREIGN KEY (`visitCardId`) REFERENCES `visitingcard` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `telephonenumber`
--

/*!40000 ALTER TABLE `telephonenumber` DISABLE KEYS */;
INSERT INTO `telephonenumber` (`id`,`visitCardId`,`telephoneNumber`) VALUES 
 ('telephoneNumber1347812219328','visitingCard1347812219265','13794037251'),
 ('telephoneNumber1347813819906','visitingCard1347813819156','119'),
 ('telephoneNumber1347813820031','visitingCard1347813819953','112'),
 ('telephoneNumber1347813820140','visitingCard1347813820093','120'),
 ('telephoneNumber1347813820281','visitingCard1347813820218','110'),
 ('telephoneNumber1348021191937','visitingCard1348021191471','13526848969');
/*!40000 ALTER TABLE `telephonenumber` ENABLE KEYS */;


--
-- Definition of table `test`
--

DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` varchar(32) NOT NULL,
  `name` varchar(45) NOT NULL,
  `sex` varchar(45) NOT NULL,
  `title` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `test`
--

/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` (`id`,`name`,`sex`,`title`) VALUES 
 ('1','dsagsagh','gdfghfgdhdf','fdjgfdj'),
 ('2','6585648','6548654','6548'),
 ('3','7675iu67i67u56','5555','65ui674j4tu56');
/*!40000 ALTER TABLE `test` ENABLE KEYS */;


--
-- Definition of table `tips`
--

DROP TABLE IF EXISTS `tips`;
CREATE TABLE `tips` (
  `id` varchar(32) NOT NULL,
  `phoneCardId` varchar(32) NOT NULL,
  `title` varchar(200) NOT NULL,
  `message` varchar(1000) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_tips_1` (`phoneCardId`),
  CONSTRAINT `FK_tips_1` FOREIGN KEY (`phoneCardId`) REFERENCES `phonecard` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tips`
--

/*!40000 ALTER TABLE `tips` DISABLE KEYS */;
INSERT INTO `tips` (`id`,`phoneCardId`,`title`,`message`) VALUES 
 ('1','1','Hello World!','This is the first message!');
/*!40000 ALTER TABLE `tips` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `userName` varchar(100) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`,`userName`) VALUES 
 ('1','Jack');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


--
-- Definition of table `visitingcard`
--

DROP TABLE IF EXISTS `visitingcard`;
CREATE TABLE `visitingcard` (
  `id` varchar(32) NOT NULL,
  `name` varchar(45) NOT NULL,
  `sex` varchar(4) default '保密',
  `title` varchar(100) default '未知',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `visitingcard`
--

/*!40000 ALTER TABLE `visitingcard` DISABLE KEYS */;
INSERT INTO `visitingcard` (`id`,`name`,`sex`,`title`) VALUES 
 ('visitingCard1347812219265','麦海杰','保密','未知'),
 ('visitingCard1347813819156','火警电话','保密','未知'),
 ('visitingCard1347813819953','交通抢险','保密','未知'),
 ('visitingCard1347813820093','急救电话','保密','未知'),
 ('visitingCard1347813820218','治安犯罪','保密','未知'),
 ('visitingCard1348021191471','陈子健','保密','未知');
/*!40000 ALTER TABLE `visitingcard` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
