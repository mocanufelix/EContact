create table t_group
(
    id   integer auto_increment,
    code varchar(10),
    name varchar(10),
    primary key (id)
);

 create table t_econtact(
    id integer auto_increment,
    lastName varchar(50),
    firstName varchar(50),
    phoneNumber varchar(50),
    address varchar(100),
    city varchar(50),
    email varchar(50),
    id_group  integer,
    primary key (id),
    foreign key (id_group) references t_group (id)
 );

