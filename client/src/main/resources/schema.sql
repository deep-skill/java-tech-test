create table client (
    id int auto_increment primary key,
    name varchar(20),
    genre varchar(10),
    age int,
    identification varchar(10),
    address varchar(50),
    phoneNumber varchar(10),
    password varchar(10),
    status bool
);