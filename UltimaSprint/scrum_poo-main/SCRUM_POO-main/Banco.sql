CREATE DATABASE IF NOT EXISTS empresa;
USE empresa;

CREATE TABLE IF NOT EXISTS funcionario (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    endereco VARCHAR(255),
    telefone VARCHAR(15),
    email VARCHAR(255),
    cargo VARCHAR(255),
    salario DOUBLE
);

CREATE TABLE associados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    endereco VARCHAR(255),
    telefone VARCHAR(20),
    email VARCHAR(255),
    pagamento_mensal DOUBLE,
    forma_pagamento VARCHAR(50)
);

CREATE TABLE atividades (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    capacidade INT
);

CREATE TABLE dependentes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    idade INT
);

CREATE TABLE feedbacks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    funcionario_id INT,
    feedback_texto TEXT,
    FOREIGN KEY (funcionario_id) REFERENCES funcionarios(id)
);

CREATE TABLE historicos_emprego (
    id INT AUTO_INCREMENT PRIMARY KEY,
    funcionario_id INT,
    empresa VARCHAR(255),
    cargo VARCHAR(255),
    ano_inicio INT,
    ano_fim INT,
    FOREIGN KEY (funcionario_id) REFERENCES funcionarios(id)
);

CREATE TABLE treinamentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    funcionario_id INT,
    nome_curso VARCHAR(255),
    ano INT,
    FOREIGN KEY (funcionario_id) REFERENCES funcionarios(id)
);
