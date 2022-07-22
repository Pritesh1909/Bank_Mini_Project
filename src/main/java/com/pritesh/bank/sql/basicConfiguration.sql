# create table
create table user_creds
(
    id            varchar(20) not null
        primary key,
    password      varchar(30) not null,
    employee_name varchar(35) not null,
    constraint user_creds_employee_name_uindex
        unique (employee_name),
    constraint user_creds_id_uindex
        unique (id)
);

# create table of accounts
create table accounts
(
    number            int(14) auto_increment
        primary key,
    name              varchar(40)   not null,
    address           varchar(40)   not null,
    mobile_number     varchar(10)   null,
    available_balance int default 0 not null,
    user_id           varchar(20)   not null,
    constraint account_details_account_number_uindex
        unique (number),
    constraint accounts_user_creds_id_fk
        foreign key (user_id) references user_creds (id)
);



