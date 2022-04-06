create sequence hibernate_sequence start 1 increment 1;
create table tb_pais (id int8 not null, nome varchar(255), nome_pt varchar(255), sigla varchar(255), primary key (id));
create table tb_peixe (id_peixe int8 not null, alimentacao int4, continente int4, especie int4, imagem varchar(255), informacao varchar(255), nome_cientifico varchar(255), nome_peixe varchar(255), tamanho_aquario int8 not null, tamanho_peixe float8 not null, tipoagua int4, pais_id int8, primary key (id_peixe));
alter table if exists tb_peixe add constraint FKkulms3o15fho2dht54ythqj34 foreign key (pais_id) references tb_pais;
