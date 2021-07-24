insert into t_group (code, name) values ( 'AA111' , 'Family');
insert into t_group (code, name) values ( 'BB222' , 'Work');

insert into t_econtact (lastName, firstName, phoneNumber, address, city, email, id_group) values ('Marcu', 'Antonia', '0742563563', 'str.Firmei nr.45', 'Tulcea', 'marcuA@yahoo.com',1);
insert into t_econtact (lastName, firstName, phoneNumber, address, city, email, id_group) values ('Popovici', 'Andreea', '0747852963', 'str.Firmei nr.45', 'Tulcea', 'andreeap@yahoo.com',1);
insert into t_econtact (lastName, firstName, phoneNumber, address, city, email, id_group) values ('Bratianu', 'Cornel', '0765987456', 'str.Firmei nr.45', 'Tulcea', 'cornelb@yahoo.com',2);

insert into t_message (addressee, subject, body) values ( 'model@model.com' , 'test','mergee');