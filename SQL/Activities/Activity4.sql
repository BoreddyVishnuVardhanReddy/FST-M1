REM   Script: Activity4
REM   activity4

Create table salesman(salesman_id int,salesman_name varchar(32),salesman_city varchar(32),commission int);

insert into salesman values(5002, 'Nail Knite', 'Paris', 13);

insert into salesman values(5005, 'Pit Alex', 'London', 11);

insert into salesman values(5006, 'McLyon', 'Paris', 14);

insert into salesman values(5007, 'Paul Adam', 'Rome', 13);

insert into salesman values(5003, 'Lauson Hen', 'San Jose', 12);

Alter table salesman Add grade int;

update salesman SET grade=100;

select * from salesman;

