create database equipar;

use equipar;

create table usuario (
id_usuario int auto_increment,
nome_usuario varchar(45),
senha_usuario varchar(45),
primary key(id_usuario));


insert into usuario(nome_usuario, senha_usuario) values("Emerson", "258852");

select * from usuario;

create table cadastro(
id int auto_increment,
nome_completo varchar(50) not null,
email varchar(50),
genero varchar(10) not null,
contato varchar(20),
endereco varchar(100),
data_nasc varchar(15),
primary key (id));

select * from cadastro; 

delete from cadastro where id=1;

