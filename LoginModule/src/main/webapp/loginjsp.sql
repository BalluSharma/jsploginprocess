create database sharmaji;
use sharmaji;

create table login(uname varchar(20), pass varchar(20));
insert into login values("ballu","1234");
insert into login values("vivek","4567");
select * from login where uname='ballu' and pass='1234';
