/*
Navicat MySQL Data Transfer

Source Server         : MySQL Server
Source Server Version : 50715
Source Host           : 127.0.0.1:3306
Source Database       : dbmajorcineplex

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-01-14 13:52:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tblbook
-- ----------------------------
DROP TABLE IF EXISTS `tblbook`;
CREATE TABLE `tblbook` (
  `BookID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `BookCode` int(20) DEFAULT NULL,
  `BookDate` datetime DEFAULT NULL,
  `ShowDate` date DEFAULT NULL,
  `TAmount` int(11) DEFAULT NULL,
  `TDiscount` int(11) DEFAULT NULL,
  `SubTotal` float(10,2) DEFAULT NULL,
  `StaffID` int(10) unsigned NOT NULL,
  `CustomerID` int(10) unsigned NOT NULL,
  `SchduleID` int(10) unsigned NOT NULL,
  `MovieID` int(10) unsigned NOT NULL,
  `TheatreID` int(10) unsigned NOT NULL,
  `TimeID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`BookID`),
  KEY `MovieID` (`MovieID`),
  KEY `StaffID` (`StaffID`),
  KEY `SchduleID` (`SchduleID`),
  KEY `CustomerID` (`CustomerID`),
  KEY `TheatreID` (`TheatreID`),
  KEY `TimeID` (`TimeID`),
  CONSTRAINT `tblbook_ibfk_1` FOREIGN KEY (`MovieID`) REFERENCES `tblmovie` (`MovieID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblbook_ibfk_2` FOREIGN KEY (`StaffID`) REFERENCES `tblstaff` (`StaffID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblbook_ibfk_3` FOREIGN KEY (`SchduleID`) REFERENCES `tblschedule` (`ScheduleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblbook_ibfk_4` FOREIGN KEY (`CustomerID`) REFERENCES `tblcustomer` (`CustomerID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblbook_ibfk_5` FOREIGN KEY (`TheatreID`) REFERENCES `tbltheatre` (`TheatreID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblbook_ibfk_6` FOREIGN KEY (`TimeID`) REFERENCES `tbltime` (`TimeID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblbook
-- ----------------------------
INSERT INTO `tblbook` VALUES ('1', '29701', '2017-01-08 05:10:11', '2017-01-08', '16', '0', '16.00', '1', '1', '6', '1', '3', '1');
INSERT INTO `tblbook` VALUES ('2', '35729', '2017-01-08 07:10:32', '2017-01-08', '15', '0', '15.00', '1', '1', '6', '1', '3', '1');
INSERT INTO `tblbook` VALUES ('3', '56734', '2017-01-09 07:17:24', '2017-01-09', '20', '0', '20.00', '1', '1', '7', '1', '2', '2');
INSERT INTO `tblbook` VALUES ('12', '49666', '2017-01-09 03:59:22', '2017-01-08', '20', '0', '20.00', '1', '26', '6', '1', '3', '1');
INSERT INTO `tblbook` VALUES ('13', '37568', '2017-01-09 04:10:27', '2017-01-08', '15', '0', '15.00', '1', '26', '6', '1', '3', '1');
INSERT INTO `tblbook` VALUES ('14', '96506', '2017-01-09 09:56:29', '2017-01-08', '15', '0', '15.00', '1', '27', '6', '1', '3', '1');
INSERT INTO `tblbook` VALUES ('15', '63829', '2017-01-09 09:58:38', '2017-01-08', '15', '0', '15.00', '1', '27', '6', '1', '3', '1');
INSERT INTO `tblbook` VALUES ('16', '45337', '2017-01-09 10:07:27', '2017-01-08', '15', '0', '15.00', '1', '28', '6', '1', '3', '1');
INSERT INTO `tblbook` VALUES ('17', '56156', '2017-01-09 10:08:09', '2017-01-08', '10', '0', '10.00', '1', '29', '6', '1', '3', '1');
INSERT INTO `tblbook` VALUES ('18', '96226', '2017-01-10 02:23:31', '2017-01-08', '15', '0', '15.00', '1', '30', '6', '1', '3', '1');
INSERT INTO `tblbook` VALUES ('19', '64459', '2017-01-10 06:51:24', '2017-01-08', '25', '0', '25.00', '1', '30', '6', '1', '3', '1');

-- ----------------------------
-- Table structure for tblbookdetail
-- ----------------------------
DROP TABLE IF EXISTS `tblbookdetail`;
CREATE TABLE `tblbookdetail` (
  `BookID` int(10) unsigned NOT NULL,
  `SeatNum` varchar(10) DEFAULT NULL,
  `Price` float(10,2) DEFAULT NULL,
  `Discount` int(11) DEFAULT NULL,
  `Amount` float(10,2) DEFAULT NULL,
  `Status` varchar(10) DEFAULT NULL,
  KEY `BookID` (`BookID`),
  CONSTRAINT `tblbookdetail_ibfk_1` FOREIGN KEY (`BookID`) REFERENCES `tblbook` (`BookID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblbookdetail
-- ----------------------------
INSERT INTO `tblbookdetail` VALUES ('1', 'A1', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('1', 'A2', '6.00', '0', '6.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('1', 'A3', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('2', 'G8', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('2', 'G9', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('2', 'G10', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('3', 'D6', '10.00', '0', '10.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('3', 'D7', '10.00', '0', '10.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('12', 'G5', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('12', 'G6', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('12', 'G7', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('13', 'G11', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('13', 'G12', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('14', 'D7', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('14', 'D8', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('15', 'E5', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('15', 'E6', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('16', 'E7', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('16', 'E8', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('17', 'A16', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('18', 'D5', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('18', 'D6', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('19', 'E9', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('19', 'E10', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('19', 'E11', '5.00', '0', '5.00', 'Booked');
INSERT INTO `tblbookdetail` VALUES ('19', 'E12', '5.00', '0', '5.00', 'Booked');

-- ----------------------------
-- Table structure for tblcancel
-- ----------------------------
DROP TABLE IF EXISTS `tblcancel`;
CREATE TABLE `tblcancel` (
  `CancelID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `CancelDate` datetime DEFAULT NULL,
  `TAmount` int(11) DEFAULT NULL,
  `StaffID` int(10) unsigned NOT NULL,
  `CustomerID` int(10) unsigned NOT NULL,
  `BookID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`CancelID`),
  KEY `CustomerID` (`CustomerID`),
  KEY `StaffID` (`StaffID`),
  KEY `BookID` (`BookID`),
  CONSTRAINT `tblcancel_ibfk_1` FOREIGN KEY (`CustomerID`) REFERENCES `tblcustomer` (`CustomerID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblcancel_ibfk_2` FOREIGN KEY (`StaffID`) REFERENCES `tblstaff` (`StaffID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblcancel_ibfk_3` FOREIGN KEY (`BookID`) REFERENCES `tblbook` (`BookID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblcancel
-- ----------------------------

-- ----------------------------
-- Table structure for tblcanceldetail
-- ----------------------------
DROP TABLE IF EXISTS `tblcanceldetail`;
CREATE TABLE `tblcanceldetail` (
  `CancelID` int(10) unsigned NOT NULL,
  `SeatNum` varchar(10) DEFAULT NULL,
  `Price` float(10,2) DEFAULT NULL,
  `Discount` int(11) DEFAULT NULL,
  `Amount` float(10,2) DEFAULT NULL,
  KEY `CancelID` (`CancelID`),
  KEY `SeatNum` (`SeatNum`),
  CONSTRAINT `tblcanceldetail_ibfk_1` FOREIGN KEY (`CancelID`) REFERENCES `tblcancel` (`CancelID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblcanceldetail_ibfk_2` FOREIGN KEY (`SeatNum`) REFERENCES `tblseat` (`SeatNum`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblcanceldetail
-- ----------------------------

-- ----------------------------
-- Table structure for tblcase
-- ----------------------------
DROP TABLE IF EXISTS `tblcase`;
CREATE TABLE `tblcase` (
  `CaseID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Qty` int(11) DEFAULT NULL,
  PRIMARY KEY (`CaseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblcase
-- ----------------------------

-- ----------------------------
-- Table structure for tblcategory
-- ----------------------------
DROP TABLE IF EXISTS `tblcategory`;
CREATE TABLE `tblcategory` (
  `CategoryID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `CategoryName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`CategoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblcategory
-- ----------------------------

-- ----------------------------
-- Table structure for tblcombo
-- ----------------------------
DROP TABLE IF EXISTS `tblcombo`;
CREATE TABLE `tblcombo` (
  `ComboID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ComboName` varchar(255) DEFAULT NULL,
  `Cost` float unsigned DEFAULT NULL,
  `SellPrice` float unsigned DEFAULT NULL,
  PRIMARY KEY (`ComboID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblcombo
-- ----------------------------

-- ----------------------------
-- Table structure for tblcombodetail
-- ----------------------------
DROP TABLE IF EXISTS `tblcombodetail`;
CREATE TABLE `tblcombodetail` (
  `ComboID` int(10) unsigned DEFAULT NULL,
  `ProductID` int(10) unsigned DEFAULT NULL,
  `Qty` int(10) unsigned DEFAULT NULL,
  KEY `ComboID` (`ComboID`),
  KEY `ProductID` (`ProductID`),
  CONSTRAINT `tblcombodetail_ibfk_1` FOREIGN KEY (`ComboID`) REFERENCES `tblcombo` (`ComboID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblcombodetail_ibfk_2` FOREIGN KEY (`ProductID`) REFERENCES `tblproduct` (`ProductID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblcombodetail
-- ----------------------------

-- ----------------------------
-- Table structure for tblcustomer
-- ----------------------------
DROP TABLE IF EXISTS `tblcustomer`;
CREATE TABLE `tblcustomer` (
  `CustomerID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `CustomerName` varchar(100) DEFAULT NULL,
  `Telephone` varchar(11) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `CustomerTypeID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`CustomerID`),
  KEY `CustomerTypeID` (`CustomerTypeID`),
  CONSTRAINT `tblcustomer_ibfk_1` FOREIGN KEY (`CustomerTypeID`) REFERENCES `tblcustomertype` (`CustomerTypeID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblcustomer
-- ----------------------------
INSERT INTO `tblcustomer` VALUES ('1', 'General', null, null, '1');
INSERT INTO `tblcustomer` VALUES ('26', 'Mirana', '098111011', null, '1');
INSERT INTO `tblcustomer` VALUES ('27', 'Sna', '12347890', null, '1');
INSERT INTO `tblcustomer` VALUES ('28', 'Ort Sna', '000000000', null, '1');
INSERT INTO `tblcustomer` VALUES ('29', 'Forever Alone', '1934567', null, '1');
INSERT INTO `tblcustomer` VALUES ('30', 'Kdam', '123456789', null, '1');

-- ----------------------------
-- Table structure for tblcustomertype
-- ----------------------------
DROP TABLE IF EXISTS `tblcustomertype`;
CREATE TABLE `tblcustomertype` (
  `CustomerTypeID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `CustomerTypeName` varchar(100) DEFAULT NULL,
  `Discount` int(11) DEFAULT NULL,
  PRIMARY KEY (`CustomerTypeID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblcustomertype
-- ----------------------------
INSERT INTO `tblcustomertype` VALUES ('1', 'Normal', '0');

-- ----------------------------
-- Table structure for tblexpense
-- ----------------------------
DROP TABLE IF EXISTS `tblexpense`;
CREATE TABLE `tblexpense` (
  `ExpenseID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ExpenseName` varchar(255) DEFAULT NULL,
  `ExpenseTypeID` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`ExpenseID`),
  KEY `ExpenseTypeID` (`ExpenseTypeID`),
  CONSTRAINT `tblexpense_ibfk_1` FOREIGN KEY (`ExpenseTypeID`) REFERENCES `tblexpensetype` (`ExpenseTypeID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblexpense
-- ----------------------------

-- ----------------------------
-- Table structure for tblexpensetype
-- ----------------------------
DROP TABLE IF EXISTS `tblexpensetype`;
CREATE TABLE `tblexpensetype` (
  `ExpenseTypeID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ExpenseTypeName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ExpenseTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblexpensetype
-- ----------------------------

-- ----------------------------
-- Table structure for tblexport
-- ----------------------------
DROP TABLE IF EXISTS `tblexport`;
CREATE TABLE `tblexport` (
  `ExportID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ExportDate` datetime DEFAULT NULL,
  `TAmount` float unsigned DEFAULT NULL,
  `StaffID` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`ExportID`),
  KEY `StaffID` (`StaffID`),
  CONSTRAINT `tblexport_ibfk_1` FOREIGN KEY (`StaffID`) REFERENCES `tblstaff` (`StaffID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblexport
-- ----------------------------

-- ----------------------------
-- Table structure for tblexportdetail
-- ----------------------------
DROP TABLE IF EXISTS `tblexportdetail`;
CREATE TABLE `tblexportdetail` (
  `ExportID` int(10) unsigned DEFAULT NULL,
  `StockerID` int(10) unsigned DEFAULT NULL,
  `ProductID` int(10) unsigned DEFAULT NULL,
  `CaseID` int(10) unsigned DEFAULT NULL,
  `CategoryID` int(11) unsigned DEFAULT NULL,
  `Qty` int(10) unsigned DEFAULT NULL,
  `UPriceIn` float(10,2) DEFAULT NULL,
  `UPriceOut` float(10,2) DEFAULT NULL,
  KEY `ExportID` (`ExportID`),
  KEY `ProductID` (`ProductID`),
  KEY `CaseID` (`CaseID`),
  KEY `CategoryID` (`CategoryID`),
  CONSTRAINT `tblexportdetail_ibfk_1` FOREIGN KEY (`ExportID`) REFERENCES `tblexport` (`ExportID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblexportdetail_ibfk_2` FOREIGN KEY (`ProductID`) REFERENCES `tblproduct` (`ProductID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblexportdetail_ibfk_3` FOREIGN KEY (`CaseID`) REFERENCES `tblcase` (`CaseID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblexportdetail_ibfk_4` FOREIGN KEY (`CategoryID`) REFERENCES `tblcategory` (`CategoryID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblexportdetail
-- ----------------------------

-- ----------------------------
-- Table structure for tblginvoice
-- ----------------------------
DROP TABLE IF EXISTS `tblginvoice`;
CREATE TABLE `tblginvoice` (
  `GInvoiceID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GInvoiceDate` datetime DEFAULT NULL,
  `TAmoint` float unsigned DEFAULT NULL,
  `TDiscount` int(10) unsigned DEFAULT NULL,
  `SubTotal` float unsigned DEFAULT NULL,
  `StaffID` int(10) unsigned NOT NULL,
  `CustomerID` int(10) unsigned NOT NULL,
  `CardNum` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`GInvoiceID`),
  KEY `StaffID` (`StaffID`),
  KEY `CustomerID` (`CustomerID`),
  CONSTRAINT `tblginvoice_ibfk_1` FOREIGN KEY (`StaffID`) REFERENCES `tblstaff` (`StaffID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblginvoice_ibfk_2` FOREIGN KEY (`CustomerID`) REFERENCES `tblcustomer` (`CustomerID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblginvoice
-- ----------------------------

-- ----------------------------
-- Table structure for tblginvoicedetail
-- ----------------------------
DROP TABLE IF EXISTS `tblginvoicedetail`;
CREATE TABLE `tblginvoicedetail` (
  `GInvoiceID` int(10) unsigned DEFAULT NULL,
  `ProductID` int(10) unsigned DEFAULT NULL,
  `Qty` int(10) unsigned DEFAULT NULL,
  `SellPrice` float unsigned DEFAULT NULL,
  `Discount` int(10) unsigned DEFAULT NULL,
  `Amount` float unsigned DEFAULT NULL,
  KEY `ProductID` (`ProductID`),
  KEY `GInvoiceID` (`GInvoiceID`),
  CONSTRAINT `tblginvoicedetail_ibfk_1` FOREIGN KEY (`ProductID`) REFERENCES `tblproduct` (`ProductID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblginvoicedetail_ibfk_2` FOREIGN KEY (`GInvoiceID`) REFERENCES `tblginvoice` (`GInvoiceID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblginvoicedetail
-- ----------------------------

-- ----------------------------
-- Table structure for tblholiday
-- ----------------------------
DROP TABLE IF EXISTS `tblholiday`;
CREATE TABLE `tblholiday` (
  `HolidayID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `HolidayDate` date DEFAULT NULL,
  `HolidayDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`HolidayID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblholiday
-- ----------------------------
INSERT INTO `tblholiday` VALUES ('1', '2017-01-10', 'Chinese New Year');

-- ----------------------------
-- Table structure for tblimport
-- ----------------------------
DROP TABLE IF EXISTS `tblimport`;
CREATE TABLE `tblimport` (
  `ImportID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ImportDate` datetime DEFAULT NULL,
  `TAmount` float unsigned DEFAULT NULL,
  `StaffID` int(10) unsigned DEFAULT NULL,
  `SupplierID` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`ImportID`),
  KEY `SupplierID` (`SupplierID`),
  KEY `StaffID` (`StaffID`),
  CONSTRAINT `tblimport_ibfk_1` FOREIGN KEY (`SupplierID`) REFERENCES `tblsupplier` (`SupplierID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblimport_ibfk_2` FOREIGN KEY (`StaffID`) REFERENCES `tblstaff` (`StaffID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblimport
-- ----------------------------

-- ----------------------------
-- Table structure for tblimportdetail
-- ----------------------------
DROP TABLE IF EXISTS `tblimportdetail`;
CREATE TABLE `tblimportdetail` (
  `ImportID` int(10) unsigned DEFAULT NULL,
  `InvoiceNum` int(10) unsigned DEFAULT NULL,
  `ProductID` int(10) unsigned DEFAULT NULL,
  `CaseID` int(10) unsigned DEFAULT NULL,
  `CategoryID` int(10) unsigned DEFAULT NULL,
  `Qty` int(10) unsigned DEFAULT NULL,
  `UPriceIN` float unsigned DEFAULT NULL,
  KEY `ImportID` (`ImportID`),
  KEY `ProductID` (`ProductID`),
  KEY `CaseID` (`CaseID`),
  KEY `CategoryID` (`CategoryID`),
  CONSTRAINT `tblimportdetail_ibfk_1` FOREIGN KEY (`ImportID`) REFERENCES `tblimport` (`ImportID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblimportdetail_ibfk_2` FOREIGN KEY (`ProductID`) REFERENCES `tblproduct` (`ProductID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblimportdetail_ibfk_3` FOREIGN KEY (`CaseID`) REFERENCES `tblcase` (`CaseID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblimportdetail_ibfk_4` FOREIGN KEY (`CategoryID`) REFERENCES `tblcategory` (`CategoryID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblimportdetail
-- ----------------------------

-- ----------------------------
-- Table structure for tbllanguage
-- ----------------------------
DROP TABLE IF EXISTS `tbllanguage`;
CREATE TABLE `tbllanguage` (
  `LanguageID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `LanguageName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`LanguageID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbllanguage
-- ----------------------------
INSERT INTO `tbllanguage` VALUES ('1', 'English');
INSERT INTO `tbllanguage` VALUES ('2', 'Khmer');

-- ----------------------------
-- Table structure for tblmodule
-- ----------------------------
DROP TABLE IF EXISTS `tblmodule`;
CREATE TABLE `tblmodule` (
  `ModuleID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ModuleName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ModuleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblmodule
-- ----------------------------

-- ----------------------------
-- Table structure for tblmovie
-- ----------------------------
DROP TABLE IF EXISTS `tblmovie`;
CREATE TABLE `tblmovie` (
  `MovieID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `MovieTitle` varchar(100) DEFAULT NULL,
  `Runningtime` int(11) DEFAULT NULL,
  `YearReleased` int(11) DEFAULT NULL,
  `Director` varchar(100) DEFAULT NULL,
  `Actor` varchar(100) DEFAULT NULL,
  `Source` varchar(100) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `khmerSubtitle` blob,
  `englishSubtitle` blob,
  `moviePoster` longblob,
  `MovieTypeID` int(10) unsigned NOT NULL,
  `Genre` varchar(225) DEFAULT NULL,
  `LanguageID` int(10) unsigned NOT NULL,
  `Status` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`MovieID`),
  KEY `LanguageID` (`LanguageID`),
  KEY `MovieTypeID` (`MovieTypeID`),
  CONSTRAINT `tblmovie_ibfk_1` FOREIGN KEY (`LanguageID`) REFERENCES `tbllanguage` (`LanguageID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblmovie_ibfk_3` FOREIGN KEY (`MovieTypeID`) REFERENCES `tblmovietype` (`MovieTypeID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblmovie
-- ----------------------------
INSERT INTO `tblmovie` VALUES ('1', 'Captain America - Civil War', '150', '2016', 'James', 'Christ, Robert djr.', 'Marvel', 'Inner core broke apart.', '', '', 0x5B42403164313866336362, '2', 'Action , SciFi', '1', 'Available Now');
INSERT INTO `tblmovie` VALUES ('2', 'Spider Man : Homecoming', '140', '2017', 'James', 'Tom', 'Marvel', 'asdfghjkl', '', '', 0x5B424061333566623933, '2', 'Action , Comedy , SciFi', '1', 'Coming Soon');
INSERT INTO `tblmovie` VALUES ('3', 'Spider Man : Homecoming', '140', '2017', 'James', 'Tom', 'Marvel', 'asdfghjkl', '', '', 0x5B424061333566623933, '3', 'Action , Comedy , SciFi', '1', 'Coming Soon');

-- ----------------------------
-- Table structure for tblmovietype
-- ----------------------------
DROP TABLE IF EXISTS `tblmovietype`;
CREATE TABLE `tblmovietype` (
  `MovieTypeID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `MovieTypeName` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`MovieTypeID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblmovietype
-- ----------------------------
INSERT INTO `tblmovietype` VALUES ('1', '2D');
INSERT INTO `tblmovietype` VALUES ('2', '3D');
INSERT INTO `tblmovietype` VALUES ('3', '4DX');

-- ----------------------------
-- Table structure for tblnoteexpense
-- ----------------------------
DROP TABLE IF EXISTS `tblnoteexpense`;
CREATE TABLE `tblnoteexpense` (
  `NoteExpenseID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NoteExpenseDate` datetime DEFAULT NULL,
  `InvoiceNum` int(10) unsigned DEFAULT NULL,
  `TAmount` float unsigned DEFAULT NULL,
  `StaffID_Note` int(10) unsigned DEFAULT NULL,
  `StaffID_Payer` int(10) unsigned DEFAULT NULL,
  `StaffID_Received` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`NoteExpenseID`),
  KEY `StaffID_Note` (`StaffID_Note`),
  KEY `StaffID_Received` (`StaffID_Received`),
  KEY `StaffID_Payer` (`StaffID_Payer`),
  CONSTRAINT `tblnoteexpense_ibfk_1` FOREIGN KEY (`StaffID_Note`) REFERENCES `tblstaff` (`StaffID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblnoteexpense_ibfk_2` FOREIGN KEY (`StaffID_Received`) REFERENCES `tblstaff` (`StaffID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblnoteexpense_ibfk_3` FOREIGN KEY (`StaffID_Payer`) REFERENCES `tblstaff` (`StaffID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblnoteexpense
-- ----------------------------

-- ----------------------------
-- Table structure for tblnoteexpensedetail
-- ----------------------------
DROP TABLE IF EXISTS `tblnoteexpensedetail`;
CREATE TABLE `tblnoteexpensedetail` (
  `NoteExpenseID` int(10) unsigned DEFAULT NULL,
  `ExpenseID` int(10) unsigned DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Amount` float unsigned DEFAULT NULL,
  KEY `NoteExpenseID` (`NoteExpenseID`),
  KEY `ExpenseID` (`ExpenseID`),
  CONSTRAINT `tblnoteexpensedetail_ibfk_1` FOREIGN KEY (`NoteExpenseID`) REFERENCES `tblnoteexpense` (`NoteExpenseID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblnoteexpensedetail_ibfk_2` FOREIGN KEY (`ExpenseID`) REFERENCES `tblexpense` (`ExpenseID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblnoteexpensedetail
-- ----------------------------

-- ----------------------------
-- Table structure for tblposition
-- ----------------------------
DROP TABLE IF EXISTS `tblposition`;
CREATE TABLE `tblposition` (
  `PositionID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `PositionName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`PositionID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblposition
-- ----------------------------
INSERT INTO `tblposition` VALUES ('1', 'General Manager');
INSERT INTO `tblposition` VALUES ('2', 'Staf');

-- ----------------------------
-- Table structure for tblprivilege
-- ----------------------------
DROP TABLE IF EXISTS `tblprivilege`;
CREATE TABLE `tblprivilege` (
  `RoleID` int(10) unsigned NOT NULL,
  `ModuleID` int(10) unsigned NOT NULL,
  `SubModuleID` int(10) unsigned NOT NULL,
  `Privilege` int(1) DEFAULT NULL,
  KEY `RoleID` (`RoleID`),
  KEY `SubModuleID` (`SubModuleID`),
  KEY `ModuleID` (`ModuleID`),
  CONSTRAINT `tblprivilege_ibfk_1` FOREIGN KEY (`RoleID`) REFERENCES `tblrole` (`RoleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblprivilege_ibfk_2` FOREIGN KEY (`SubModuleID`) REFERENCES `tblsubmodule` (`SubModuleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblprivilege_ibfk_3` FOREIGN KEY (`ModuleID`) REFERENCES `tblmodule` (`ModuleID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblprivilege
-- ----------------------------

-- ----------------------------
-- Table structure for tblproduct
-- ----------------------------
DROP TABLE IF EXISTS `tblproduct`;
CREATE TABLE `tblproduct` (
  `ProductID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Barcode` int(11) DEFAULT NULL,
  `ProductName` varchar(255) DEFAULT NULL,
  `CaseID` int(10) unsigned DEFAULT NULL,
  `CaseQty` int(11) DEFAULT NULL,
  `WholeQty` int(11) DEFAULT NULL,
  `UPriceIn` float(10,2) DEFAULT NULL,
  `UPriceOut` float(10,2) DEFAULT NULL,
  `ExpiredDate` datetime DEFAULT NULL,
  `CategoryID` int(10) unsigned DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ProductID`),
  KEY `CategoryID` (`CategoryID`),
  KEY `CaseID` (`CaseID`),
  CONSTRAINT `tblproduct_ibfk_1` FOREIGN KEY (`CategoryID`) REFERENCES `tblcategory` (`CategoryID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblproduct_ibfk_2` FOREIGN KEY (`CaseID`) REFERENCES `tblcase` (`CaseID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblproduct
-- ----------------------------

-- ----------------------------
-- Table structure for tblpromotion
-- ----------------------------
DROP TABLE IF EXISTS `tblpromotion`;
CREATE TABLE `tblpromotion` (
  `PromotionID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `PromotionName` varchar(100) DEFAULT NULL,
  `Discount` int(10) DEFAULT NULL,
  PRIMARY KEY (`PromotionID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblpromotion
-- ----------------------------
INSERT INTO `tblpromotion` VALUES ('1', 'None', '0');
INSERT INTO `tblpromotion` VALUES ('2', 'Early Bird', '15');
INSERT INTO `tblpromotion` VALUES ('3', 'Late Night Owl', '15');
INSERT INTO `tblpromotion` VALUES ('4', 'Final Exam', '90');

-- ----------------------------
-- Table structure for tblrole
-- ----------------------------
DROP TABLE IF EXISTS `tblrole`;
CREATE TABLE `tblrole` (
  `RoleID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `RoleName` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`RoleID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblrole
-- ----------------------------
INSERT INTO `tblrole` VALUES ('1', 'Admin');
INSERT INTO `tblrole` VALUES ('2', 'Ticket Seller');
INSERT INTO `tblrole` VALUES ('3', 'Snack Seller');
INSERT INTO `tblrole` VALUES ('4', 'Stock Holder');

-- ----------------------------
-- Table structure for tblschedule
-- ----------------------------
DROP TABLE IF EXISTS `tblschedule`;
CREATE TABLE `tblschedule` (
  `ScheduleID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `StaffID` int(10) unsigned NOT NULL,
  `ScheduleDate` date DEFAULT NULL,
  `ShowDate` date DEFAULT NULL,
  `MovieID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ScheduleID`),
  KEY `MovieID` (`MovieID`),
  CONSTRAINT `tblschedule_ibfk_1` FOREIGN KEY (`MovieID`) REFERENCES `tblmovie` (`MovieID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblschedule
-- ----------------------------
INSERT INTO `tblschedule` VALUES ('6', '1', '2017-01-08', '2017-01-08', '1');
INSERT INTO `tblschedule` VALUES ('7', '1', '2017-01-09', '2017-01-09', '1');

-- ----------------------------
-- Table structure for tblscheduledetail
-- ----------------------------
DROP TABLE IF EXISTS `tblscheduledetail`;
CREATE TABLE `tblscheduledetail` (
  `ScheduleID` int(10) unsigned NOT NULL,
  `TimeID` int(10) unsigned NOT NULL,
  `TheatreID` int(10) unsigned NOT NULL,
  `EndTime` time DEFAULT NULL,
  `PromotionID` int(10) unsigned DEFAULT NULL,
  KEY `TimeID` (`TimeID`),
  KEY `TheatreID` (`TheatreID`),
  KEY `ScheduleID` (`ScheduleID`),
  KEY `PromotionID` (`PromotionID`),
  CONSTRAINT `tblscheduledetail_ibfk_2` FOREIGN KEY (`TimeID`) REFERENCES `tbltime` (`TimeID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblscheduledetail_ibfk_3` FOREIGN KEY (`TheatreID`) REFERENCES `tbltheatre` (`TheatreID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblscheduledetail_ibfk_4` FOREIGN KEY (`ScheduleID`) REFERENCES `tblschedule` (`ScheduleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblscheduledetail_ibfk_5` FOREIGN KEY (`PromotionID`) REFERENCES `tblpromotion` (`PromotionID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblscheduledetail
-- ----------------------------
INSERT INTO `tblscheduledetail` VALUES ('6', '1', '3', '10:45:00', '2');
INSERT INTO `tblscheduledetail` VALUES ('7', '2', '2', '22:15:00', '3');

-- ----------------------------
-- Table structure for tblseat
-- ----------------------------
DROP TABLE IF EXISTS `tblseat`;
CREATE TABLE `tblseat` (
  `TheatreID` int(10) unsigned NOT NULL,
  `SeatNum` varchar(10) NOT NULL,
  `SeatTypeID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`SeatNum`),
  KEY `TheatreID` (`TheatreID`),
  KEY `SeatTypeID` (`SeatTypeID`),
  CONSTRAINT `tblseat_ibfk_1` FOREIGN KEY (`TheatreID`) REFERENCES `tbltheatre` (`TheatreID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblseat_ibfk_2` FOREIGN KEY (`SeatTypeID`) REFERENCES `tblseattype` (`SeatTypeID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblseat_ibfk_3` FOREIGN KEY (`SeatNum`) REFERENCES `tbltinvoicedetail` (`SeatNum`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblseat
-- ----------------------------

-- ----------------------------
-- Table structure for tblseattype
-- ----------------------------
DROP TABLE IF EXISTS `tblseattype`;
CREATE TABLE `tblseattype` (
  `SeatTypeID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `SeatTypeName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`SeatTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblseattype
-- ----------------------------

-- ----------------------------
-- Table structure for tblsinvoice
-- ----------------------------
DROP TABLE IF EXISTS `tblsinvoice`;
CREATE TABLE `tblsinvoice` (
  `SInvoiceID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `SInvoiceDate` datetime DEFAULT NULL,
  `TAmount` float unsigned DEFAULT NULL,
  `TDiscount` int(10) unsigned DEFAULT NULL,
  `SubTotal` float unsigned DEFAULT NULL,
  `StaffID` int(10) unsigned DEFAULT NULL,
  `CustomerID` int(10) unsigned DEFAULT NULL,
  `CardNum` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`SInvoiceID`),
  KEY `StaffID` (`StaffID`),
  KEY `CustomerID` (`CustomerID`),
  CONSTRAINT `tblsinvoice_ibfk_1` FOREIGN KEY (`StaffID`) REFERENCES `tblstaff` (`StaffID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblsinvoice_ibfk_2` FOREIGN KEY (`CustomerID`) REFERENCES `tblcustomer` (`CustomerID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblsinvoice
-- ----------------------------

-- ----------------------------
-- Table structure for tblsinvoicedetail
-- ----------------------------
DROP TABLE IF EXISTS `tblsinvoicedetail`;
CREATE TABLE `tblsinvoicedetail` (
  `SInvoiceID` int(10) unsigned DEFAULT NULL,
  `ProductID` int(10) unsigned DEFAULT NULL,
  `CategoryID` int(10) unsigned DEFAULT NULL,
  `Size` int(10) DEFAULT NULL,
  `Qty` int(10) unsigned DEFAULT NULL,
  `UPriceIn` float(10,2) DEFAULT NULL,
  `UPriceOut` float(10,2) unsigned DEFAULT NULL,
  KEY `SInvoiceID` (`SInvoiceID`),
  KEY `ProductID` (`ProductID`),
  CONSTRAINT `tblsinvoicedetail_ibfk_1` FOREIGN KEY (`SInvoiceID`) REFERENCES `tblsinvoice` (`SInvoiceID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblsinvoicedetail_ibfk_2` FOREIGN KEY (`ProductID`) REFERENCES `tblproduct` (`ProductID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblsinvoicedetail
-- ----------------------------

-- ----------------------------
-- Table structure for tblstaff
-- ----------------------------
DROP TABLE IF EXISTS `tblstaff`;
CREATE TABLE `tblstaff` (
  `StaffID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `StaffName` varchar(100) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Birthdate` date DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `Telephone` varchar(11) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Salary` int(11) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `ProfilePhoto` blob,
  `PositionID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`StaffID`),
  KEY `PositionID` (`PositionID`),
  CONSTRAINT `tblstaff_ibfk_1` FOREIGN KEY (`PositionID`) REFERENCES `tblposition` (`PositionID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblstaff
-- ----------------------------
INSERT INTO `tblstaff` VALUES ('1', 'Saman Manet', 'Male', '1996-04-18', 'Phnom Penh', '93377218', 'steveninet7@gmail.com', '250', 'Active', null, '1');
INSERT INTO `tblstaff` VALUES ('2', 'Ing Seakleng', 'Male', '1995-05-29', 'Phnom Penh', '93683836', 'seakleng_ing@yahoo.com', '250', 'Active', null, '2');
INSERT INTO `tblstaff` VALUES ('17', 'er', 'Male', '2017-01-09', 'qwe', '12312', 'ert', '123', 'Active', 0x2F737461666670726F66696C652F5365616B6C656E672E706E67, '1');
INSERT INTO `tblstaff` VALUES ('18', 'shae', 'Male', '2017-01-16', 'dfty', '23423', 'werty', '234', 'Active', 0x2F737461666670726F66696C652F5365616B6C656E672E706E67, '1');
INSERT INTO `tblstaff` VALUES ('19', 'Old', 'Female', '2017-01-10', 'Phnom Penh', '0999876543', 'asfasldf', '5000', 'Active', 0x2F737461666670726F66696C652F5365616B6C656E672E706E67, '1');

-- ----------------------------
-- Table structure for tblstock
-- ----------------------------
DROP TABLE IF EXISTS `tblstock`;
CREATE TABLE `tblstock` (
  `ProductID` int(10) unsigned DEFAULT NULL,
  `ImportID` int(10) unsigned DEFAULT NULL,
  `Qty` int(10) unsigned DEFAULT NULL,
  `Cost` float unsigned DEFAULT NULL,
  KEY `ImportID` (`ImportID`),
  KEY `ProductID` (`ProductID`),
  CONSTRAINT `tblstock_ibfk_2` FOREIGN KEY (`ImportID`) REFERENCES `tblimport` (`ImportID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tblstock_ibfk_3` FOREIGN KEY (`ProductID`) REFERENCES `tblproduct` (`ProductID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblstock
-- ----------------------------

-- ----------------------------
-- Table structure for tblstocktype
-- ----------------------------
DROP TABLE IF EXISTS `tblstocktype`;
CREATE TABLE `tblstocktype` (
  `StockTypeID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `StockTypeName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`StockTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblstocktype
-- ----------------------------

-- ----------------------------
-- Table structure for tblsubmodule
-- ----------------------------
DROP TABLE IF EXISTS `tblsubmodule`;
CREATE TABLE `tblsubmodule` (
  `SubModuleID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `SubModuleName` varchar(100) DEFAULT NULL,
  `ModuleID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`SubModuleID`),
  KEY `ModuleID` (`ModuleID`),
  CONSTRAINT `tblsubmodule_ibfk_1` FOREIGN KEY (`ModuleID`) REFERENCES `tblmodule` (`ModuleID`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblsubmodule
-- ----------------------------

-- ----------------------------
-- Table structure for tblsupplier
-- ----------------------------
DROP TABLE IF EXISTS `tblsupplier`;
CREATE TABLE `tblsupplier` (
  `SupplierID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `SupplierName` varchar(255) DEFAULT NULL,
  `ContactName` varchar(255) DEFAULT NULL,
  `Telephone` int(11) unsigned DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SupplierID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblsupplier
-- ----------------------------
INSERT INTO `tblsupplier` VALUES ('1', 'The Coca Cola Company', 'Visal PISETH', '12555576', 'Coca-Cola Company Headquarters.\r\n1 Coca Cola Plz NW Get Directions.\r\nAtlanta, GA 30313.\r\n', 'VisalPS@coca-cola.com');
INSERT INTO `tblsupplier` VALUES ('2', 'Pepsi', 'Rith', '12454588', 'bvb.Street C4K, Beoung Tom Pun, Phnom Penh', 'rithRS@pepsi.com');
INSERT INTO `tblsupplier` VALUES ('3', 'The CornFamily', 'Pheap KHENG', '23678678', 'Kampong Thom', 'pheapKH@tcf.com');
INSERT INTO `tblsupplier` VALUES ('4', 'Supplier Name', 'Contact Name', null, 'Address', 'Email');

-- ----------------------------
-- Table structure for tbltheatre
-- ----------------------------
DROP TABLE IF EXISTS `tbltheatre`;
CREATE TABLE `tbltheatre` (
  `TheatreID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ThreatreName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`TheatreID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbltheatre
-- ----------------------------
INSERT INTO `tbltheatre` VALUES ('1', '4DX');
INSERT INTO `tbltheatre` VALUES ('2', 'VIP');
INSERT INTO `tbltheatre` VALUES ('3', 'Theatre 2');
INSERT INTO `tbltheatre` VALUES ('4', 'Theatre 3');
INSERT INTO `tbltheatre` VALUES ('5', 'Theatre 4');
INSERT INTO `tbltheatre` VALUES ('6', 'Theatre 5');
INSERT INTO `tbltheatre` VALUES ('7', 'Theatre 6');
INSERT INTO `tbltheatre` VALUES ('8', 'Theatre 7');

-- ----------------------------
-- Table structure for tbltime
-- ----------------------------
DROP TABLE IF EXISTS `tbltime`;
CREATE TABLE `tbltime` (
  `TimeID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Time` time DEFAULT NULL,
  PRIMARY KEY (`TimeID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbltime
-- ----------------------------
INSERT INTO `tbltime` VALUES ('1', '08:00:00');
INSERT INTO `tbltime` VALUES ('2', '19:30:00');

-- ----------------------------
-- Table structure for tbltinvoice
-- ----------------------------
DROP TABLE IF EXISTS `tbltinvoice`;
CREATE TABLE `tbltinvoice` (
  `TInvoiceID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TInvoiceDate` datetime DEFAULT NULL,
  `TAmount` int(11) DEFAULT NULL,
  `TDiscount` int(11) DEFAULT NULL,
  `SubTotal` float(10,2) DEFAULT NULL,
  `StaffID` int(10) unsigned NOT NULL,
  `CustomerID` int(10) unsigned NOT NULL,
  `CardNum` int(11) DEFAULT NULL,
  `ScheduleID` int(10) unsigned NOT NULL,
  `MovieID` int(10) unsigned NOT NULL,
  `TheatreID` int(10) unsigned NOT NULL,
  `TimeID` int(10) unsigned NOT NULL,
  `BookID` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`TInvoiceID`),
  KEY `BookID` (`BookID`),
  KEY `TimeID` (`TimeID`),
  KEY `TheatreID` (`TheatreID`),
  KEY `MovieID` (`MovieID`),
  KEY `CustomerID` (`CustomerID`),
  KEY `ScheduleID` (`ScheduleID`),
  KEY `StaffID` (`StaffID`),
  CONSTRAINT `tbltinvoice_ibfk_1` FOREIGN KEY (`BookID`) REFERENCES `tblbook` (`BookID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbltinvoice_ibfk_2` FOREIGN KEY (`TimeID`) REFERENCES `tbltime` (`TimeID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbltinvoice_ibfk_3` FOREIGN KEY (`TheatreID`) REFERENCES `tbltheatre` (`TheatreID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbltinvoice_ibfk_4` FOREIGN KEY (`MovieID`) REFERENCES `tblmovie` (`MovieID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbltinvoice_ibfk_5` FOREIGN KEY (`CustomerID`) REFERENCES `tblcustomer` (`CustomerID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbltinvoice_ibfk_6` FOREIGN KEY (`ScheduleID`) REFERENCES `tblschedule` (`ScheduleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbltinvoice_ibfk_7` FOREIGN KEY (`StaffID`) REFERENCES `tblstaff` (`StaffID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbltinvoice
-- ----------------------------
INSERT INTO `tbltinvoice` VALUES ('1', '2017-01-08 17:27:49', '25', '0', '25.00', '1', '1', null, '6', '1', '3', '1', null);

-- ----------------------------
-- Table structure for tbltinvoicedetail
-- ----------------------------
DROP TABLE IF EXISTS `tbltinvoicedetail`;
CREATE TABLE `tbltinvoicedetail` (
  `TInvoiceID` int(10) unsigned NOT NULL,
  `SeatNum` varchar(10) DEFAULT NULL,
  `Price` float(10,2) DEFAULT NULL,
  `Discount` int(11) unsigned DEFAULT NULL,
  `Amount` float(10,2) DEFAULT NULL,
  KEY `TInvoiceID` (`TInvoiceID`),
  KEY `SeatNum` (`SeatNum`),
  CONSTRAINT `tbltinvoicedetail_ibfk_2` FOREIGN KEY (`TInvoiceID`) REFERENCES `tbltinvoice` (`TInvoiceID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbltinvoicedetail
-- ----------------------------
INSERT INTO `tbltinvoicedetail` VALUES ('1', 'C9', '5.00', '0', '5.00');
INSERT INTO `tbltinvoicedetail` VALUES ('1', 'C10', '5.00', '0', '5.00');
INSERT INTO `tbltinvoicedetail` VALUES ('1', 'C11', '5.00', '0', '5.00');
INSERT INTO `tbltinvoicedetail` VALUES ('1', 'C12', '5.00', '0', '5.00');
INSERT INTO `tbltinvoicedetail` VALUES ('1', 'C13', '5.00', '0', '5.00');

-- ----------------------------
-- Table structure for tbluser
-- ----------------------------
DROP TABLE IF EXISTS `tbluser`;
CREATE TABLE `tbluser` (
  `StaffID` int(10) unsigned NOT NULL,
  `UserName` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  `RoleID` int(10) unsigned NOT NULL,
  KEY `RoleID` (`RoleID`),
  KEY `StaffID` (`StaffID`),
  CONSTRAINT `tbluser_ibfk_1` FOREIGN KEY (`RoleID`) REFERENCES `tblrole` (`RoleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbluser_ibfk_2` FOREIGN KEY (`StaffID`) REFERENCES `tblstaff` (`StaffID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbluser
-- ----------------------------
INSERT INTO `tbluser` VALUES ('1', 'Manet', 'Manet', '1');
INSERT INTO `tbluser` VALUES ('2', 'Seakleng', 'Seakleng', '2');

-- ----------------------------
-- Table structure for tblweek
-- ----------------------------
DROP TABLE IF EXISTS `tblweek`;
CREATE TABLE `tblweek` (
  `WeakID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `WeakName` varchar(10) DEFAULT NULL,
  `P2DNormal` float(10,2) DEFAULT NULL,
  `P3DNormal` float(10,2) DEFAULT NULL,
  `PVIP` float(10,2) DEFAULT NULL,
  `P4DXFront` float(10,2) DEFAULT NULL,
  `P4DXBack` float(10,2) DEFAULT NULL,
  PRIMARY KEY (`WeakID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblweek
-- ----------------------------
INSERT INTO `tblweek` VALUES ('1', 'Weekly', '3.00', '5.00', '9.00', '9.00', '11.00');
INSERT INTO `tblweek` VALUES ('2', 'Weekend', '4.00', '6.00', '10.00', '10.00', '12.00');

-- ----------------------------
-- View structure for dbvlistmovie
-- ----------------------------
DROP VIEW IF EXISTS `dbvlistmovie`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `dbvlistmovie` AS select `tblmovie`.`MovieID` AS `MovieID`,`tblmovie`.`MovieTitle` AS `MovieTitle`,`tblmovie`.`MovieTypeID` AS `MovieTypeID`,`tblmovie`.`GenreID` AS `GenreID`,`tblmovie`.`Runningtime` AS `Runningtime`,`tblmovie`.`YearReleased` AS `YearReleased`,`tblmovie`.`Source` AS `Source`,`tblmovie`.`LanguageID` AS `LanguageID` from `tblmovie` ;
