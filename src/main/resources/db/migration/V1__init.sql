create table users(
  id SERIAL PRIMARY KEY,
  username VARCHAR(30) NOT NULL UNIQUE,
  password VARCHAR(150) NOT NULL
);

insert into users (username, password) values ('admin', '$2a$10$nh8bym652FGvklMMgCu.Eu0KIxpTpJtLhBvtYfp798eE/mBMuZ7FC');

create table student(
  id SERIAL PRIMARY KEY,
  fullname VARCHAR NOT NULL
);

create table payment(
  id SERIAL PRIMARY KEY,
  student_id INT NOT NULL REFERENCES student,
  amount INTEGER NOT NULL,
  successful BOOLEAN NOT NULL DEFAULT true
);

