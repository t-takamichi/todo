CREATE DATABASE todo_db;

CREATE USER todouser@'localhost' IDENTIFIED BY 'todoTest111';

GRANT ALL PRIVILEGES ON todo_db.* TO todouser@'localhost';

FLUSH PRIVILEGES;


USE todo_db;


CREATE TABLE todo (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    content VARCHAR(255) NOT NULL,
    limitdate DATE NOT NULL,
    checkflg INT,
    createddate DATE default (CURRENT_DATE)
);