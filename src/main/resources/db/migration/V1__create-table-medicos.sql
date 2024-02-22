CREATE TABLE medicos (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    crm VARCHAR(6) NOT NULL UNIQUE,
    especialidade VARCHAR(100) NOT NULL,
    logradouro VARCHAR(100) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    cep VARCHAR(9) NOT NULL,
    complemento VARCHAR(100),
    numero VARCHAR(20),
    uf CHAR(2) NOT NULL,
    cidade VARCHAR(100) NOT NULL
);

ALTER TABLE medicos
ALTER COLUMN especialidade TYPE smallint
USING (
    CASE
        WHEN especialidade = 'ORTOPEDIA' THEN 1
        WHEN especialidade = 'CARDIOLOGIA' THEN 2
        WHEN especialidade = 'GINECOLOGIA' THEN 3
        WHEN especialidade = 'DERMATOLOGIA' THEN 4
        ELSE 0
    END
);
