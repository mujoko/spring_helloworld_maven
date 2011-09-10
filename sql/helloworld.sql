-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 30, 2011 at 02:38 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `helloworld`
--

-- --------------------------------------------------------

--
-- Table structure for table `attribute`
--
CREATE TABLE  `helloworld`.`attribute` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1
--
-- Dumping data for table `attribute`
--

INSERT INTO `attribute` (`id`,`name`, `value`) VALUES
('a','a', 'Leter A'),
('b','car', 'Auto'),
('c','developer', 'Entwickler'),
('d','pen', 'Kugelschreiber'),
('e','work', 'Arbeit');

-- --------------------------------------------------------
--
-- Table structure for table `box_model`
--
CREATE TABLE  `helloworld`.`box_model` (
  `id` varchar(255) NOT NULL,
  `status` bit(1) DEFAULT NULL,
  `box_area` varchar(255) DEFAULT NULL,
  `box_five` varchar(255) DEFAULT NULL,
  `box_four` varchar(255) DEFAULT NULL,
  `box_one` varchar(255) DEFAULT NULL,
  `box_three` varchar(255) DEFAULT NULL,
  `box_two` varchar(255) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  `origin` varchar(255) DEFAULT NULL,
  `type` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

--
-- Dumping data for table `box_model`
--

