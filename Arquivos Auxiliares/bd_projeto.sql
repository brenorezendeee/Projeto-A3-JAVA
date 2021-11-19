DROP DATABASE test;

CREATE DATABASE BDPROJETO;

CREATE USER 'equipe6'@'%' IDENTIFIED BY '123';

GRANT ALL ON *.* TO 'equipe6'@'%' WITH GRANT OPTION;

USE BDPROJETO;

/***** TABELA CLIENTES *****/
CREATE TABLE tb_clientes (
  id int auto_increment primary key,
  nome varchar(100),
  rg varchar (30),
  cpf varchar (20),
  email varchar(200),
  telefone varchar(30),
  celular varchar(30),
  cep varchar(100),
  endereco varchar (255),
  numero int,
  complemento varchar (200),
  bairro varchar (100),
  cidade varchar (100),
  estado varchar (2)
);
/*****************/

/***** TABELA FUNCIONARIOS *****/
CREATE TABLE tb_funcionarios (
  id int auto_increment primary key,
  nome varchar(100),
  rg varchar (30),
  cpf varchar (20),
  email varchar(200),
  senha varchar(10),
  cargo varchar(100),
  nivel_acesso varchar(50),
  telefone varchar(30),
  celular varchar(30),
  cep varchar(100),
  endereco varchar (255),
  numero int,
  complemento varchar (200),
  bairro varchar (100),
  cidade varchar (100),
  estado varchar (2)
);
/*****************/

/***** TABELA FUNÇÕES *****/
CREATE TABLE tb_funcoes (
  id int auto_increment primary key,
  cargo varchar(100),
  atividades text
);
/*****************/

/******Comandos*****/

select * from tb_clientes;
select * from tb_funcionarios;
select * from tb_funcoes;


alter table tb_funcoes drop foreign key funcionario_id;
select * from tb_clientes where cpf = "111.111.111 - 11";