-- Funciona como uma espécie de Migration para o banco In Memory HC₂
create table produto (
    id varchar(255) not null primary key,
    nome varchar(50) not null,
    descricao varchar(300),
    preco numeric(18, 2)
);