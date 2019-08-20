drop database if exists sampledb11;
create database sampledb11;
use sampledb11;

create table sample_table11(
No int,
name varchar(50),
age int,
Mail varchar(50)
);

insert into sample_table11 values(1,"Yamada",21,"xxx@yahoo.co.jp");
insert into sample_table11 values(2,"Sato",39,"yyy@google.com");
insert into sample_table11 values(3,"Harada",44,"zzz@yahoo.co.jp");
