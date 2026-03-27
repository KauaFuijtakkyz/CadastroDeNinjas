--migration para adicionar a coluna   de rank na tabela de cadastro

CREATE TABLE tb_cadastro (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             nome VARCHAR(255),
                             email VARCHAR(255)
    -- outros campos iniciais, mas SEM o rank ainda se você quiser usar o V2
);

