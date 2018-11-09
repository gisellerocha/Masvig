drop database if exists helpdesk;
create database helpdesk;
use helpdesk;

-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 09-Nov-2018 às 02:22
-- Versão do servidor: 10.1.36-MariaDB
-- versão do PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `helpdesk`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `atendimento`
--

CREATE TABLE `atendimento` (
  `id_atendimento` int(11) NOT NULL,
  `sla` varchar(10) DEFAULT NULL,
  `situacao_atendimento` varchar(20) DEFAULT NULL,
  `data_atendimento` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `telefone` int(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `responsavel` varchar(50) DEFAULT NULL,
  `assunto` varchar(50) DEFAULT NULL,
  `descricao` varchar(1000) DEFAULT NULL,
  `id_problema` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `atendimento`
--

INSERT INTO `atendimento` (`id_atendimento`, `sla`, `situacao_atendimento`, `data_atendimento`, `telefone`, `email`, `responsavel`, `assunto`, `descricao`, `id_problema`) VALUES
(2, NULL, NULL, '2018-11-08 21:14:46', 44, 'sasda', 'asdsda', 'ssa', 'sdasda', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `cnpj` varchar(20) NOT NULL,
  `razao_social` varchar(60) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `endereço` varchar(60) DEFAULT NULL,
  `complemento` varchar(30) DEFAULT NULL,
  `num` varchar(20) DEFAULT NULL,
  `municipio` varchar(20) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `dataCadastro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `telefone` bigint(14) NOT NULL,
  `celular` bigint(14) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`cnpj`, `razao_social`, `nome`, `endereço`, `complemento`, `num`, `municipio`, `estado`, `email`, `dataCadastro`, `telefone`, `celular`) VALUES
('12.345.678/0001-23', 'Que Isso Fera', 'Tatiana', 'Rua das Palmeiras', 'Bloco B', '121', 'SP', 'São Paulo', 'queissofera@gmail.com', '2018-11-08 22:13:44', 13133, 1212),
('23.489.082/0001-90', 'May do Ceu', 'Mayra', 'Rua da facul', 'efke', '67', 'SP', 'São Paulo', 'aijfbn', '2018-11-08 23:18:56', 23, 33),
('65.839.271/0001-89', 'Ateu Cubanos', 'Rodrigo', 'Rua dos Cubanos', 'Bloco D', '420', 'SP', 'São Paulo', 'cubateu@gmail.com', '2018-11-08 22:16:18', 9535, 2039835),
('95.382.735/8972-89', 'Juao', 'João Pinto', 'Rua do Ju', 'kd', '1', 'SP', 'São Paulo', 'fans', '2018-11-08 23:45:17', 40028922, 40028922);

-- --------------------------------------------------------

--
-- Estrutura da tabela `historico`
--

CREATE TABLE `historico` (
  `id_alteraçao` int(11) NOT NULL,
  `id_atendimento` int(11) DEFAULT NULL,
  `funcional` int(11) DEFAULT NULL,
  `alteraçao` varchar(1000) DEFAULT NULL,
  `data_alteraçao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `problema`
--

CREATE TABLE `problema` (
  `id_problema` int(11) NOT NULL,
  `tipo_problema` varchar(30) DEFAULT NULL,
  `descricao` varchar(180) DEFAULT NULL,
  `data_registro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `funcional` int(11) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `logradouro` varchar(120) DEFAULT NULL,
  `complemento` varchar(20) DEFAULT NULL,
  `municipio` varchar(20) DEFAULT NULL,
  `estado` varchar(30) DEFAULT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `cpf` varchar(20) NOT NULL,
  `rg` varchar(20) DEFAULT NULL,
  `data_nasc` date DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `num` varchar(10) DEFAULT NULL,
  `orgao` varchar(20) DEFAULT NULL,
  `exp` varchar(20) DEFAULT NULL,
  `cargo` varchar(10) DEFAULT NULL,
  `situacao` varchar(20) DEFAULT NULL,
  `salario` decimal(10,3) DEFAULT NULL,
  `data_cadastro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`funcional`, `nome`, `logradouro`, `complemento`, `municipio`, `estado`, `sexo`, `email`, `cpf`, `rg`, `data_nasc`, `telefone`, `celular`, `num`, `orgao`, `exp`, `cargo`, `situacao`, `salario`, `data_cadastro`, `senha`) VALUES
(1, 'gii', 'ss', 'aa', 'SP', 'São Paulo', 'Feminino', '222', '111.111.111-11', '11.111.111-11', '1997-11-18', '1', '1', '11', 'SP', 'SSP', 'Gerente', NULL, NULL, '2018-11-04 01:40:18', '1'),
(2, 'mayara', 'rua', 'R', 'SP', 'São Paulo', 'Feminino', 'G', '222.222.222-22', '22.222.222-22', '1997-09-11', '44', '44', '1', 'SP', 'SSP', 'Gerente', NULL, NULL, '2018-11-07 20:55:56', '1234567'),
(4, 'Giselle', 'Rua Tal', 'Andar', 'SP', 'São Paulo', 'Feminino', 'gi', '123.456.789-00', '12.345.678-99', '1989-09-13', '40028922', '40028922', '12', 'SP', 'SSP', 'Gerente', NULL, NULL, '2018-11-07 21:23:37', '123456'),
(5, 'Mayara Silva', 'Rua Facul', 'j', 'SP', 'São Paulo', 'Feminino', 'gi', '098.765.432-11', '09.876.543-21', '1991-11-11', '48403', '9393', '123', 'SP', 'SSP', 'Tecnico', NULL, NULL, '2018-11-07 21:24:55', '123456'),
(6, 'Rodrigo', 'idjiosda', 'indiodj', 'SP', 'São Paulo', 'Feminino', 'dggd', '421.460.848-80', '34.774.249-22', '1991-11-18', '532', '52', '34232', 'SP', 'SSP', 'Gerente', NULL, NULL, '2018-11-08 23:20:08', '1'),
(7, 'Igor Felix', 'Rua da Facul', 'Bloco', 'SP', 'São Paulo', 'Feminino', 'igor', '462.817.543-78', '39.328.923-29', '1991-05-05', '40028922', '40028922', '81818', 'SP', 'SSP', 'Gerente', NULL, NULL, '2018-11-08 23:46:52', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `atendimento`
--
ALTER TABLE `atendimento`
  ADD PRIMARY KEY (`id_atendimento`),
  ADD KEY `fk_atendimento_problema` (`id_problema`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cnpj`);

--
-- Indexes for table `historico`
--
ALTER TABLE `historico`
  ADD PRIMARY KEY (`id_alteraçao`),
  ADD KEY `fk_id_atendimento` (`id_atendimento`),
  ADD KEY `fk_funcional` (`funcional`);

--
-- Indexes for table `problema`
--
ALTER TABLE `problema`
  ADD PRIMARY KEY (`id_problema`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`funcional`),
  ADD UNIQUE KEY `cpf` (`cpf`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `atendimento`
--
ALTER TABLE `atendimento`
  MODIFY `id_atendimento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `historico`
--
ALTER TABLE `historico`
  MODIFY `id_alteraçao` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `problema`
--
ALTER TABLE `problema`
  MODIFY `id_problema` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `funcional` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `atendimento`
--
ALTER TABLE `atendimento`
  ADD CONSTRAINT `fk_atendimento_problema` FOREIGN KEY (`id_problema`) REFERENCES `problema` (`id_problema`);

--
-- Limitadores para a tabela `historico`
--
ALTER TABLE `historico`
  ADD CONSTRAINT `fk_funcional` FOREIGN KEY (`funcional`) REFERENCES `usuario` (`funcional`),
  ADD CONSTRAINT `fk_id_atendimento` FOREIGN KEY (`id_atendimento`) REFERENCES `atendimento` (`id_atendimento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
