CREATE DATABASE IF NOT EXISTS Banco;
USE Banco;

CREATE TABLE tabela(
	id int primary key auto_increment,
    nome varchar(100),
    cidade varchar(100)
);

select * from tabela;