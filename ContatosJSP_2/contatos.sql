-- Banco de Dados: contatos
DROP DATABASE IF EXISTS contatos;
CREATE DATABASE IF NOT EXISTS contatos;
USE contatos;

-- Estrutura da tabela usuario
CREATE TABLE usuario
(
	usuario varchar(8) NOT NULL PRIMARY KEY,
	senha varchar(60) NOT NULL,
	nome varchar(50) NOT NULL,
	cat varchar(2) NOT NULL
);

-- Estrutura da tabela tipo
CREATE TABLE IF NOT EXISTS tipo 
(
	idt varchar(2) NOT NULL PRIMARY KEY,
	nomet varchar(30) NOT NULL
);

-- Estrutura da tabela contato
CREATE TABLE IF NOT EXISTS contato
(
	idc BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nomec varchar(60) NOT NULL,
	emailc varchar(60) NOT NULL,
	tipoc varchar(2) NOT NULL,
	FOREIGN KEY (tipoc) REFERENCES tipo(idt) ON DELETE CASCADE
);

-- Inserindo dados da tabela tipo
INSERT INTO tipo (idt, nomet) 
VALUES('cm', 'Comum');
INSERT INTO tipo (idt, nomet) 
VALUES('pc', 'Parceiro');
INSERT INTO tipo (idt, nomet) 
VALUES('fc', 'Funcionário');

-- Inserindo dados da tabela usuario
INSERT INTO usuario (usuario, senha, nome, cat)
VALUES('admin', sha1('abc'), 'Administrador', '00');
INSERT INTO usuario (usuario, senha, nome, cat)
VALUES('usuario1', sha1('abc'), 'Usuario1', '10');

-- Inserindo dados da tabela contato
INSERT INTO contato (idc, nomec, emailc, tipoc) 
VALUES(null, 'João', 'joao@gmail.com', 'cm');
INSERT INTO contato (idc, nomec, emailc, tipoc) 
VALUES(null, 'Maria', 'maria@hotmail.com', 'pc');
INSERT INTO contato (idc, nomec, emailc, tipoc) 
VALUES(null, 'Carlos', 'carlos@terra.com.br', 'cm');
INSERT INTO contato (idc, nomec, emailc, tipoc) 
VALUES(null, 'Paulo', 'paulo@gmail.com', 'cm');
INSERT INTO contato (idc, nomec, emailc, tipoc) 
VALUES(null, 'Marcos', 'marcos@hotmail.com', 'pc');
INSERT INTO contato (idc, nomec, emailc, tipoc) 
VALUES(null, 'Ana', 'ana@hotmail.com', 'fc');
INSERT INTO contato (idc, nomec, emailc, tipoc) 
VALUES(null, 'José', 'jose@terra.com.br', 'cm');
INSERT INTO contato (idc, nomec, emailc, tipoc) 
VALUES(null, 'Sonia', 'sonia@gmail.com', 'fc');