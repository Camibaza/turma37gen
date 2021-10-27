-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_sistema_cooperativo
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_sistema_cooperativo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_sistema_cooperativo` DEFAULT CHARACTER SET utf8 ;
USE `db_sistema_cooperativo` ;

-- -----------------------------------------------------
-- Table `db_sistema_cooperativo`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_sistema_cooperativo`.`categoria` (
  `id_categoria` INT NOT NULL AUTO_INCREMENT,
  `artesanal` ENUM('decoracao', 'alimentacao', 'cosmeticos') NOT NULL,
  `forma_pagamento` ENUM('a vista', 'pix', 'cartao') NOT NULL,
  PRIMARY KEY (`id_categoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_sistema_cooperativo`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_sistema_cooperativo`.`Usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `nome_completo` VARCHAR(255) NOT NULL,
  `email_usuario` VARCHAR(255) NOT NULL,
  `senha_usuario` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_sistema_cooperativo`.`Produtos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_sistema_cooperativo`.`Produtos` (
  `id_produto` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `codigo` VARCHAR(255) NOT NULL,
  `preco` DOUBLE NOT NULL,
  `quantidade` INT NOT NULL,
  `fk_categoria` INT NOT NULL,
  `fk_usuario` INT NOT NULL,
  PRIMARY KEY (`id_produto`, `fk_categoria`, `fk_usuario`),
  INDEX `fk_Categoria_has_Usuario_Usuario1_idx` (`fk_usuario` ASC) VISIBLE,
  INDEX `fk_Categoria_has_Usuario_Categoria_idx` (`fk_categoria` ASC) VISIBLE,
  CONSTRAINT `fk_Categoria_has_Usuario_Categoria`
    FOREIGN KEY (`fk_categoria`)
    REFERENCES `db_sistema_cooperativo`.`categoria` (`id_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Categoria_has_Usuario_Usuario1`
    FOREIGN KEY (`fk_usuario`)
    REFERENCES `db_sistema_cooperativo`.`Usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
