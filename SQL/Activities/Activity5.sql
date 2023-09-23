REM   Script: Activity5
REM   activity5

Create table salesman(salesman_id int,salesman_name varchar(32),salesman_city varchar(32),commission int);

insert into salesman values(5002, 'Nail Knite', 'Paris', 13);

insert into salesman values(5005, 'Pit Alex', 'London', 11);

insert into salesman values(5006, 'McLyon', 'Paris', 14);

insert into salesman values(5007, 'Paul Adam', 'Rome', 13);

insert into salesman values(5003, 'Lauson Hen', 'San Jose', 12);

SELECT * FROM salesman;

Alter table salesman Add grade int;

select * from salesman;

update salesman SET grade=100;

select * from salesman;

select * from salesman;

Update salesman set grade=200 where salesman_city='Rome';

update salesman set grade=300 where salesman_city='James Hoog';

select * from salesman;

Update salesman set grade=200 where salesman_city='Rome';

update salesman set grade=300 where salesman_name='James Hoog';

select * from salesman;

Update salesman set grade=200 where salesman_city='Rome';

update salesman set grade=300 where salesman_name='James Hoog';

update salesman set salesman_name='Pierre' where salesman_name='McLyon';

select * from salesman;

