CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categorias (
	id INT (5) AUTO_INCREMENT,
    tipo ENUM("Medicamento","Higiene","Perfumaria"),
    receita BOOLEAN NOT NULL,
    PRIMARY kEY (id)
);

CREATE TABLE tb_produtos (
	id_produto INT (8) AUTO_INCREMENT,
    nome VARCHAR (255) NOT NULL,
    preco DECIMAL (10,2) NOT NULL,
    quantidade INT (10) NOT NULL,
    fk_categoria_id INT (5) NOT NULL,
    FOREIGN KEY (fk_categoria_id) REFERENCES tb_categorias(id),
    PRIMARY KEY (id_produto)
);

INSERT INTO tb_categorias (tipo, receita) VALUES
("Medicamento", 1),
("Medicamento", 0),
("Higiene", 0),
("Perfumaria", 0);

INSERT INTO tb_produtos (nome, preco, quantidade, fk_categoria_id) VALUES
("Amoxicilina", 41.99, 10, 1),
("Dipiridamol", 65.00, 10, 1),
("Buscopan", 7.99, 10, 2),
("Neosaldina", 15.95, 10, 2),
("Espuma de barbear", 25.50, 10, 3),
("Sabonete em barra", 10.00, 10, 3),
("Azzaro", 150.00, 10, 4),
("Dior", 250.00, 10, 4);

SELECT * FROM tb_produtos WHERE preco > 50 ;

SELECT * FROM tb_produtos WHERE preco BETWEEN 3 AND 60 ;

SELECT * FROM tb_produtos WHERE nome LIKE 'b%' ;

SELECT * FROM tb_produtos
	INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.fk_categoria_id ;
    
    SELECT * FROM tb_produtos
	INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.fk_categoria_id 
WHERE id = 4;
