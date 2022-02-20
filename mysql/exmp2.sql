create database nithindb;
use nithindb;
create table EMP (Empid int not null, Empname varchar(20),age int);
select * from EMP;
insert into EMP (Empid , Empname, age) values (2, 'Arun',25);
update EMP set age = 26 where Empid  = 1;