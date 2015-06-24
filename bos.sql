-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 23, 2015 at 10:52 AM
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bos`
--

-- --------------------------------------------------------

--
-- Table structure for table `akreditasi`
--

CREATE TABLE IF NOT EXISTS `akreditasi` (
  `id_akred` int(1) NOT NULL,
  `nama_akred` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`id_akred`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `akreditasi`
--

INSERT INTO `akreditasi` (`id_akred`, `nama_akred`) VALUES
(1, 'A'),
(2, 'B'),
(3, 'C');

-- --------------------------------------------------------

--
-- Table structure for table `data_sekolah`
--

CREATE TABLE IF NOT EXISTS `data_sekolah` (
  `id_sek` int(5) NOT NULL AUTO_INCREMENT,
  `nama_sek` varchar(30) NOT NULL,
  `jum_guru` int(5) NOT NULL,
  `jum_murid` int(5) NOT NULL,
  `id_kec` int(5) NOT NULL,
  `id_status` int(1) NOT NULL,
  `id_akred` int(1) NOT NULL,
  `id_klas` int(1) NOT NULL,
  PRIMARY KEY (`id_sek`),
  KEY `id_kec` (`id_kec`),
  KEY `id_status` (`id_status`),
  KEY `id_akred` (`id_akred`),
  KEY `id_klas` (`id_klas`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `data_sekolah`
--

INSERT INTO `data_sekolah` (`id_sek`, `nama_sek`, `jum_guru`, `jum_murid`, `id_kec`, `id_status`, `id_akred`, `id_klas`) VALUES
(4, 'SDN 2 Medaeng', 20, 200, 6, 1, 2, 2),
(5, 'SDN 3 Medaeng', 13, 210, 6, 1, 2, 2),
(11, 'aedad', 1, 2, 2, 2, 2, 3),
(12, 'adadad', 2, 2, 2, 2, 2, 2),
(13, 'dwdw', 1, 1, 2, 2, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `kecamatan`
--

CREATE TABLE IF NOT EXISTS `kecamatan` (
  `id_kec` int(8) NOT NULL AUTO_INCREMENT,
  `nama_kec` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_kec`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `kecamatan`
--

INSERT INTO `kecamatan` (`id_kec`, `nama_kec`) VALUES
(1, 'Wonoayu'),
(2, 'Sukodono'),
(3, 'Krian'),
(4, 'Tulangan'),
(5, 'Tanggulangin'),
(6, 'Waru'),
(7, 'Sidoarjo'),
(8, 'Balongbendo'),
(9, 'Sedati'),
(10, 'Porong'),
(11, 'Tarik'),
(12, 'Taman'),
(13, 'Prambon'),
(14, 'Krembung'),
(15, 'Jabon'),
(16, 'Gedangan'),
(17, 'Buduran'),
(18, 'Candi');

-- --------------------------------------------------------

--
-- Table structure for table `klasifikasi`
--

CREATE TABLE IF NOT EXISTS `klasifikasi` (
  `id_klas` int(1) NOT NULL,
  `nama_klas` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`id_klas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `klasifikasi`
--

INSERT INTO `klasifikasi` (`id_klas`, `nama_klas`) VALUES
(1, 'Rendah'),
(2, 'Sedang'),
(3, 'Tinggi');

-- --------------------------------------------------------

--
-- Table structure for table `prediksi`
--

CREATE TABLE IF NOT EXISTS `prediksi` (
  `id_pred` int(5) NOT NULL AUTO_INCREMENT,
  `id_sek` int(5) NOT NULL,
  `id_klas` int(1) NOT NULL,
  PRIMARY KEY (`id_pred`),
  KEY `id_sek` (`id_sek`),
  KEY `id_klas` (`id_klas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `status_sekolah`
--

CREATE TABLE IF NOT EXISTS `status_sekolah` (
  `id_status` int(1) NOT NULL,
  `nama_status` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`id_status`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `status_sekolah`
--

INSERT INTO `status_sekolah` (`id_status`, `nama_status`) VALUES
(1, 'Negeri'),
(2, 'Swasta');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `data_sekolah`
--
ALTER TABLE `data_sekolah`
  ADD CONSTRAINT `data_sekolah_ibfk_1` FOREIGN KEY (`id_kec`) REFERENCES `kecamatan` (`id_kec`),
  ADD CONSTRAINT `data_sekolah_ibfk_2` FOREIGN KEY (`id_status`) REFERENCES `status_sekolah` (`id_status`),
  ADD CONSTRAINT `data_sekolah_ibfk_3` FOREIGN KEY (`id_akred`) REFERENCES `akreditasi` (`id_akred`),
  ADD CONSTRAINT `data_sekolah_ibfk_4` FOREIGN KEY (`id_klas`) REFERENCES `klasifikasi` (`id_klas`);

--
-- Constraints for table `prediksi`
--
ALTER TABLE `prediksi`
  ADD CONSTRAINT `prediksi_ibfk_1` FOREIGN KEY (`id_sek`) REFERENCES `data_sekolah` (`id_sek`),
  ADD CONSTRAINT `prediksi_ibfk_2` FOREIGN KEY (`id_klas`) REFERENCES `klasifikasi` (`id_klas`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
