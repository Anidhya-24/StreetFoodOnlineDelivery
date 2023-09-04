/*
SQLyog Enterprise - MySQL GUI v8.14 
MySQL - 5.0.24-community-nt : Database - food
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`food` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `food`;

/*Table structure for table `admin_sf` */

DROP TABLE IF EXISTS `admin_sf`;

CREATE TABLE `admin_sf` (
  `ID` varchar(40) default NULL,
  `PASSWORD` varchar(40) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin_sf` */

insert  into `admin_sf`(`ID`,`PASSWORD`) values ('amit@gmail.com','123');

/*Table structure for table `area` */

DROP TABLE IF EXISTS `area`;

CREATE TABLE `area` (
  `ID` int(11) NOT NULL auto_increment,
  `NAME` varchar(50) default NULL,
  `CITY_NAME` varchar(50) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `area` */

insert  into `area`(`ID`,`NAME`,`CITY_NAME`) values (301,'MP Nagar','BHOPAL'),(302,'DB Mall','BHOPAL'),(303,'RAJWADA','INDORE'),(304,'56','INDORE');

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `ID` int(11) NOT NULL auto_increment,
  `NAME` varchar(50) default NULL,
  `STATE_NAME` varchar(4000) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `city` */

insert  into `city`(`ID`,`NAME`,`STATE_NAME`) values (201,'BHOPAL','MP'),(202,'INDORE','MP'),(203,'JABLPUR','MP'),(204,'AGARA','UP');

/*Table structure for table `contact` */

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `NAME` varchar(50) default NULL,
  `EMAIL` varchar(100) default NULL,
  `MOBILE` int(11) default NULL,
  `MESSAGE` varchar(4000) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contact` */

/*Table structure for table `fc_reg` */

DROP TABLE IF EXISTS `fc_reg`;

CREATE TABLE `fc_reg` (
  `EMAIL` varchar(50) default NULL,
  `FOODCORNER_NAME` varchar(50) default NULL,
  `OWNER_NAME` varchar(50) default NULL,
  `CONTACT` int(11) default NULL,
  `PASSWORD` varchar(50) default NULL,
  `ADDRESS` varchar(200) default NULL,
  `AREA` varchar(50) default NULL,
  `CITY` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fc_reg` */

insert  into `fc_reg`(`EMAIL`,`FOODCORNER_NAME`,`OWNER_NAME`,`CONTACT`,`PASSWORD`,`ADDRESS`,`AREA`,`CITY`) values ('aman@gmail.com','apniDukan','AMAN',9584776,'123','MP Nagar','MP Nagar','BHOPAL');

/*Table structure for table `menu` */

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `FC_ID` varchar(4000) default NULL,
  `ITEM_NAME` varchar(4000) default NULL,
  `PRICE` varchar(4000) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `menu` */

insert  into `menu`(`FC_ID`,`ITEM_NAME`,`PRICE`) values ('aman@gmail.com','Dosa','60'),('aman@gmail.com','IDALi','40');

/*Table structure for table `order_details` */

DROP TABLE IF EXISTS `order_details`;

CREATE TABLE `order_details` (
  `ITEM_PRICE` int(11) default NULL,
  `QTY` int(11) default NULL,
  `OID` int(11) default NULL,
  `ITEM_NAME` varchar(4000) default NULL,
  `ITEM_ID` varchar(4000) default NULL,
  `C_ID` varchar(4000) default NULL,
  `ADDRESS` varchar(1000) default NULL,
  `FC` varchar(4000) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `order_details` */

insert  into `order_details`(`ITEM_PRICE`,`QTY`,`OID`,`ITEM_NAME`,`ITEM_ID`,`C_ID`,`ADDRESS`,`FC`) values (60,1,94673,',Dosa',',1','sotreshop156@gmail.com','AwadPuri','');

/*Table structure for table `state` */

DROP TABLE IF EXISTS `state`;

CREATE TABLE `state` (
  `ID` int(11) NOT NULL auto_increment,
  `NAME` varchar(50) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `state` */

insert  into `state`(`ID`,`NAME`) values (101,'MP'),(102,'UP'),(103,'MH');

/*Table structure for table `user_reg` */

DROP TABLE IF EXISTS `user_reg`;

CREATE TABLE `user_reg` (
  `NAME` varchar(100) default NULL,
  `CONTACT` varchar(50) default NULL,
  `EMAIL` varchar(50) default NULL,
  `PASSWORD` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_reg` */

insert  into `user_reg`(`NAME`,`CONTACT`,`EMAIL`,`PASSWORD`) values ('Amit Nagar','9584776113','sotreshop156@gmail.com','123Abc');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
