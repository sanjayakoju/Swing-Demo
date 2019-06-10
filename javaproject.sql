-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 25, 2018 at 04:30 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `distribution`
--

CREATE TABLE `distribution` (
  `did` int(11) NOT NULL,
  `pid` int(11) DEFAULT NULL,
  `names` varchar(160) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `checkedBy` varchar(160) DEFAULT NULL,
  `place` varchar(120) DEFAULT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `distribution`
--

INSERT INTO `distribution` (`did`, `pid`, `names`, `qty`, `price`, `date`, `checkedBy`, `place`, `Total`) VALUES
(1, 1, 'Petrol Oil', 1000, 103, '2018-04-17', 'sanish', 'SuryaBinayak', 103600),
(2, 4, 'Disel Oil', 1200, 95, '2018-04-17', 'sanish', 'Kalimati', 114840),
(3, 1, 'Petrol Oil', 1248, 103, '2018-04-17', 'sanjaya', 'Jagati', 129292.79999999999),
(4, 4, 'Disel Oil', 120, 95, '2018-04-17', 'sanjaya', 'Sallghari', 11484);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `username`, `password`, `status`) VALUES
(1, 'admin', '21232f297a57a5a743894a0e4a801fc3', 1),
(2, 'user', 'ee11cbb19052e40b07aac0ca060c23ee', 0),
(3, 'sanjaya', 'd9dba78b00e9b6a5bd72d66b9321b63f', 1),
(5, 'Nepal', '45f1a4b4a2f6bdfa31838a823064389f', 0),
(6, 'Bishal', '1adb27fabdfee91e29a94e3fb02e08bc', 1),
(7, 'nishan', '2088f10212c0d95657ad431ad9f46df8', 1),
(8, 'normal', 'fea087517c26fadd409bd4b9dc642555', 0),
(9, 'deepak', '498b5924adc469aa7b660f457e0fc7e5', 1),
(10, 'sanish', '5799f1a28cbe1f8f9ca080bfa51e5245', 0),
(11, 'tanginamo', '7ff2574e6df5fd0e5970fe3474e72aec', 1);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `names` varchar(40) NOT NULL,
  `qty` int(11) NOT NULL,
  `price` double NOT NULL,
  `date` varchar(120) NOT NULL,
  `CheckedBy` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `names`, `qty`, `price`, `date`, `CheckedBy`) VALUES
(1, 'Petrol Oil', 195152, 103.6, 'Fri Feb 09 17:20:42 NPT 2018', 'admin'),
(4, 'Disel Oil', 48680, 95.7, 'Sat Feb 10 19:52:33 NPT 2018', 'sanjaya'),
(8, 'Kerosene', 120000, 76.67, 'Tue Apr 17 09:01:50 NPT 2018', 'sanjaya');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `distribution`
--
ALTER TABLE `distribution`
  ADD PRIMARY KEY (`did`),
  ADD KEY `pid` (`pid`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `names` (`names`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `distribution`
--
ALTER TABLE `distribution`
  MODIFY `did` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `distribution`
--
ALTER TABLE `distribution`
  ADD CONSTRAINT `distribution_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `product` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
