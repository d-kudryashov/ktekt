CREATE TABLE roles (
  id   INT          NOT NULL PRIMARY KEY,
  name VARCHAR(128) NOT NULL UNIQUE
);

CREATE TABLE user_roles (
  user_id INT NOT NULL,
  role_id INT NOT NULL,

  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (role_id) REFERENCES roles (id),

  UNIQUE (user_id, role_id)
);

INSERT INTO roles (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO roles (id, name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO users (id, username, password) VALUES (1, 'admin', '$2a$10$V.6USAwcs9Q5F3GFUR6AB.o4BVxbvTtGUc4q2wFdBcLfoBl8jn7IC');
INSERT INTO users (id, username, password) VALUES (2, 'user', '$2a$10$Zz0Q/dS6LmlsRzx6YRn.wOIWV5ggRQcCNjb2xsHeGdAX8/jS2rmwC');

INSERT INTO user_roles (user_id, role_id) VALUES (1, 2);
INSERT INTO user_roles (user_id, role_id) VALUES (2, 1);