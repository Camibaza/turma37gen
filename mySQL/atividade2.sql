CREATE DATABASE db_ecommerce;
USE db_ecommerce;
CREATE TABLE tb_produtos(
id_produto INT AUTO_INCREMENT,
nome VARCHAR(255),
cor VARCHAR(255),
tamanho CHAR,
preco DOUBLE,
PRIMARY KEY(id_produto)

);

INSERT INTO tb_produtos(nome, cor, tamanho, preco) VALUES
("Vestido", "Vermelho", "M", 200.00),
("Calça", "Preto", "G", 350.00),
("Bermuda", "Bege", "P", 280.00),
("Blusa", "Azul", "M", 550.00),
("Camiseta", "Rosa", "G", 480.00),
("Biquini", "Colorido", "P", 375.00),
("Saia", "Jeans", "G", 600.00),
("Jaqueta", "Cinza", "M", 800.00)
;

SELECT * FROM tb_produtos WHERE preco>500;
SELECT * FROM tb_produtos WHERE preco<500;

USE db_ecommerce;
UPDATE tb_produtos SET preco = 600.00 WHERE id_produto = 7;