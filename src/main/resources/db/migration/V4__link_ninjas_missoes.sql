-- Adiciona a coluna que vai guardar o ID da missão na tabela de ninjas
ALTER TABLE TB_CADASTRO ADD COLUMN missoes_id BIGINT;

-- Cria o vínculo real entre as duas tabelas
ALTER TABLE TB_CADASTRO
    ADD CONSTRAINT fk_ninjas_missoes
        FOREIGN KEY (missoes_id) REFERENCES TB_MISSOES(id);
