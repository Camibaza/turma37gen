CREATE DATABASE db_rh;
USE db_rh;
CREATE TABLE tb_funcionarios(
id_funcionario INT AUTO_INCREMENT,
nome VARCHAR(255),
email VARCHAR(255),
cargo VARCHAR(255),
salario DOUBLE NULL,
PRIMARY KEY(id_funcionario)

);

INSERT INTO tb_funcionarios(nome, email, cargo, salario) VALUES 
("Camila", "camila@email.com", "supervisora", 3000.00),
("Julia", "julia@email.com", "Designer", 5000.00),
("Fernanda", "fernanda@email.com", "Organizadora de festa", 2000.00),
("Bruna", "bruna@email.com", "Conselheira", 1000.00),
("Alyson", "alyson@email.com", "Diretor Geral", 10000.00)
;

SELECT * FROM tb_funcionarios WHERE salario>2000;

SELECT * FROM tb_funcionarios WHERE salario<2000; 

USE db_rh;

UPDATE tb_funcionarios SET salario = 1500.00 WHERE id_funcionario = 4;
