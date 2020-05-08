-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 08-Maio-2020 às 02:18
-- Versão do servidor: 10.4.8-MariaDB
-- versão do PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_cds`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cd`
--

CREATE TABLE `cd` (
  `id_cd` int(255) NOT NULL,
  `nome` varchar(1500) NOT NULL,
  `preco` varchar(40) NOT NULL,
  `descricao` varchar(1500) NOT NULL,
  `quantidade` int(255) NOT NULL,
  `numero_vendas` int(255) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cd`
--

INSERT INTO `cd` (`id_cd`, `nome`, `preco`, `descricao`, `quantidade`, `numero_vendas`) VALUES
(5, 'Fala', '10,00', 'comigo', 8, 3),
(6, 'Zezé', '10,00', 'Sozinho', 27, 7),
(7, 'Alex', '10,00', 'olá', 7, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(255) NOT NULL,
  `nome` varchar(60) NOT NULL,
  `email` varchar(40) NOT NULL,
  `pedido1` varchar(255) DEFAULT NULL,
  `pedido2` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nome`, `email`, `pedido1`, `pedido2`) VALUES
(3, 'Áquila', 'aquilasdf@outlook.com', 'Olá', ''),
(4, 'José', 'jose123@gmail.com', 'Isso', 'Aqui'),
(5, 'Bernado', 'bernado@gmail.com', NULL, NULL);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cd`
--
ALTER TABLE `cd`
  ADD PRIMARY KEY (`id_cd`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cd`
--
ALTER TABLE `cd`
  MODIFY `id_cd` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
