CREATE TABLE users_achievements (
    achievement_id int NOT NULL,
    user_id int NOT NULL
);

ALTER TABLE users_achievements ADD CONSTRAINT achievement_id_fk foreign key (achievement_id) references achievements(id);

ALTER TABLE users_achievements ADD CONSTRAINT user_id_fk foreign key (user_id) references users(id);