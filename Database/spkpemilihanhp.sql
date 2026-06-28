-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 28 Jun 2026 pada 10.01
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `spkpemilihanhp`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabelalternatif1`
--

CREATE TABLE `tabelalternatif1` (
  `id` int(11) NOT NULL,
  `namahp` varchar(50) NOT NULL,
  `c1` varchar(50) NOT NULL,
  `c2` varchar(50) NOT NULL,
  `c3` varchar(50) NOT NULL,
  `c4` varchar(50) NOT NULL,
  `c5` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tabelalternatif1`
--

INSERT INTO `tabelalternatif1` (`id`, `namahp`, `c1`, `c2`, `c3`, `c4`, `c5`) VALUES
(10, 'Xiaomi Redmi 15C 4G', 'Mediatek Dimesty', '6GB', '128 GB', '6000 mAh', '2065000'),
(11, 'Samsung Galaxy A17', 'Samxung Exynos', '8GB', '256 GB', '5000 mAh', '1779000'),
(12, 'Huawei Mate 20', 'Hisilicon Kirin', '4GB', '128 GB', '5000 mAh', '2300000'),
(13, 'Poco M7 4G', 'Snapdragon', '8GB', '256 GB', '7000 mAh', '2650000'),
(14, 'Infinix Note 40 Pro 5G', 'Mediatek Dimesty', '8GB', '256 GB', '5000 mAh', '2825000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabelkriteria`
--

CREATE TABLE `tabelkriteria` (
  `id` varchar(50) NOT NULL,
  `kriteria` varchar(50) NOT NULL,
  `keterangan` varchar(50) NOT NULL,
  `nilai` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tabelkriteria`
--

INSERT INTO `tabelkriteria` (`id`, `kriteria`, `keterangan`, `nilai`) VALUES
('002', 'Chipset', 'Mediatek Dimesty', '3'),
('004', 'Chipset', 'Hisilicon Kirin', '1'),
('005', 'RAM', '4GB', '1'),
('006', 'RAM', '6GB', '2'),
('007', 'RAM', '8GB', '3'),
('008', 'RAM', '12GB', '4'),
('003', 'Chipset', 'Samxung Exynos', '2'),
('001', 'Chipset', 'SnapDragon', '4');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabelsaw`
--

CREATE TABLE `tabelsaw` (
  `id` int(11) NOT NULL,
  `namahp` varchar(50) NOT NULL,
  `c1` double NOT NULL,
  `c2` double NOT NULL,
  `c3` double NOT NULL,
  `c4` double NOT NULL,
  `c5` double NOT NULL,
  `sum` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tabelsaw`
--

INSERT INTO `tabelsaw` (`id`, `namahp`, `c1`, `c2`, `c3`, `c4`, `c5`, `sum`) VALUES
(1, 'Xiaomi Redmi 15C 4G', 0.22, 0.1, 0.07, 0.11, 0.2, 0.71),
(2, 'Samsung Galaxy A17', 0.15, 0.15, 0.1, 0.04, 0.3, 0.74),
(3, 'Huawei Mate 20', 0.07, 0.05, 0.07, 0.04, 0.2, 0.43),
(4, 'Poco M7 4G', 0.3, 0.15, 0.1, 0.15, 0.1, 0.8),
(5, 'Infinix Note 40 Pro 5G', 0.22, 0.15, 0.1, 0.04, 0.1, 0.61);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tebelalternatif2`
--

CREATE TABLE `tebelalternatif2` (
  `id` int(11) NOT NULL,
  `namahp` varchar(50) NOT NULL,
  `c1` double NOT NULL,
  `c2` double NOT NULL,
  `c3` double NOT NULL,
  `c4` double NOT NULL,
  `c5` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tebelalternatif2`
--

INSERT INTO `tebelalternatif2` (`id`, `namahp`, `c1`, `c2`, `c3`, `c4`, `c5`) VALUES
(8, 'Xiaomi Redmi 15C 4G', 3, 2, 2, 3, 2),
(9, 'Samsung Galaxy A17', 2, 3, 3, 1, 3),
(10, 'Huawei Mate 20', 1, 1, 2, 1, 2),
(11, 'Poco M7 4G', 4, 3, 3, 4, 1),
(12, 'Infinix Note 40 Pro 5G', 3, 3, 3, 1, 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('admin', 'admin123'),
('sadsad', 'dwqdqw');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tabelalternatif1`
--
ALTER TABLE `tabelalternatif1`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `tabelsaw`
--
ALTER TABLE `tabelsaw`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `tebelalternatif2`
--
ALTER TABLE `tebelalternatif2`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tabelalternatif1`
--
ALTER TABLE `tabelalternatif1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT untuk tabel `tabelsaw`
--
ALTER TABLE `tabelsaw`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT untuk tabel `tebelalternatif2`
--
ALTER TABLE `tebelalternatif2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
