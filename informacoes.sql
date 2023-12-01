-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01/12/2023 às 14:31
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `fatecparking`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `informacoes`
--

CREATE TABLE `informacoes` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `ra` varchar(13) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefone` varchar(50) NOT NULL,
  `senha` varchar(6) NOT NULL,
  `curso` varchar(3) NOT NULL,
  `funcao` varchar(20) NOT NULL,
  `marcaveiculo` varchar(20) NOT NULL,
  `modeloveiculo` varchar(30) NOT NULL,
  `placaveiculo` varchar(10) NOT NULL,
  `corveiculo` varchar(10) NOT NULL,
  `vaga` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `informacoes`
--

INSERT INTO `informacoes` (`id`, `nome`, `cpf`, `ra`, `email`, `telefone`, `senha`, `curso`, `funcao`, `marcaveiculo`, `modeloveiculo`, `placaveiculo`, `corveiculo`, `vaga`) VALUES
(1, 'Admin Fatec', '111.111.111-11', '127594375374', 'admin@fatec.sp.gov.br', '(12) 98573-2017', 'admin1', 'ADS', 'Funcionário', 'Volkswagen', 'Fusca', 'BQH-2143', 'Branco', '01'),
(2, 'Coordenação Fatec', '222.222.222-22', '1226451345424', 'coord@fatec.sp.gov.br', '(12) 98231-4092', 'coord1', 'ADS', 'Funcionário', 'Fiat', 'Uno', 'POE-2010', 'Azul', '02'),
(3, 'Diretor', '333.333.333-33', '23243252364', 'diretor@gmail.com', '(12) 98233-1202', 'dir123', 'ADS', 'Funcionário', 'Volkswagen', 'Gol', 'LIA-9P12', 'Prata', '03'),
(4, 'Funcionario poirehfre', '444.444.444-44', '241435425426', 'func@gmail.com', '(12) 98432-1023', 'funcio', 'ADS', 'Funcionario', 'Fiat', 'Argo', 'FGY-8L20', 'Cinza', '04'),
(5, 'Secretária', '555.555.555-55', '43254524523', 'sec@gmail.com', '(12) 98212-0943', 'sec555', 'GPI', 'Funcionario', 'Jeep', 'Compass', 'COM-2P43', 'Branco', '05'),
(6, 'Aluna Exemplo', '424.537.593-29', '41324353245', 'alunafatec@gmail.com', '(12) 98563-2930', 'aluna1', 'GPI', 'Estudante', 'Fiat', 'Fastback', 'OIR-0A13', 'Vermelho', '08'),
(7, 'Carlos Henrique Loureiro Feichas', '123.123.123-12', '12143253463', 'feichas@fatec.sp.gov.br', '(12) 98532-1233', 'carlos', 'ADS', 'Professor', 'Volkswagen', 'Polo', 'MNA-2910', 'Branco', '03');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `informacoes`
--
ALTER TABLE `informacoes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `informacoes`
--
ALTER TABLE `informacoes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
