create table "user"
(
    id         bigint auto_increment
        primary key,
    name       varchar(20) not null,
    company_id bigint,
    gender     varchar(2)
);


create table company
(
    id   bigint auto_increment
        primary key,
    name varchar(20) not null,
    code varchar(10) not null
);


