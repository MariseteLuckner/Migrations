create table profiles (
    id int8 NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    primary key (id)
);

create table users_profiles (
    user_id integer not null,
    profiles_id integer not null,
    primary key (user_id, profiles_id)
);

alter table users_profiles add constraint profiles_id_constraint foreign key (profiles_id) references profiles (id);

alter table users_profiles add constraint user_id_constraint foreign key (user_id) references users (id);