create database helpdesk;

use helpdesk;

create table usuario (
	funcional int auto_increment,
    senha varchar(30),
    nome varchar(40) not null,
    logradouro varchar(120), -- composto
    complemento varchar(20),
    municipio varchar(20),
    estado varchar(30),
    sexo varchar(20),
    email varchar(40),
    cpf integer unsigned not null,
    rg integer unsigned, -- composto
    data_nasc date,
    telefone varchar(20),
	celular varchar(20),
    num varchar(10),
    orgao varchar(20),
    exp varchar(20),
    cargo varchar(10),
    situacao varchar(20), -- ativo, demitido, suspenso, 
	salario decimal (10,3),
    data_cadastro timestamp,
	constraint pk_usuario primary key(funcional)
);

create table cliente (
	cpf int(11) unsigned not null,
    nome varchar(50) not null,
    endereço varchar(60),
    complemento(30),
    municipio(20),
    estado(20),
    email varchar(40),
    dataNasc date,
    rg integer unsigned,
    orgao varchar(20),
    exp varchar(30),
    sexo varchar(20),
    dataCadastro timestamp,
    telefone BIGINT(14) not null,
	celular BIGINT(14),
    num varchar(20),
    constraint pk_cliente primary key(cpf)
);

create table equipamento(
	tipo_equipamento varchar(50) not null,
   	descricao varchar(180),
    id_equipamento integer unsigned not null primary key,
    data_registro timestamp not null
);

create table problema(
	tipo_problema varchar(50) not null,
	descricao varchar(180),
    id_problema integer auto_increment not null primary key,
    data_registro timestamp not null
);

create table atendimento(
	id_atendimento varchar(100),
    cpf int(11) unsigned not null,
    funcional int,
	sla varchar(10) not null, -- tempo de atendimento
    situacao_atendimento char(3) not null, -- concluido, em aberto, finalizado
	data_atendimento timestamp not null,
	id_equipamento integer unsigned not null,
    id_problema integer not null,
	constraint pk_atendimento primary key (id_atendimento),
    constraint fk_atendimento_usuario foreign key(funcional) references usuario(funcional),
    constraint fk_atendimento_cliente foreign key(cpf) references cliente(cpf),
    constraint fk_atendimento_equipamento foreign key(id_equipamento) references equipamento(id_equipamento),
    constraint fk_atendimento_problema foreign key(id_problema) references problema(id_problema)
);