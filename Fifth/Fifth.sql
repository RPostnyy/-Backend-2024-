CREATE TABLE Users (
    ID INT PRIMARY KEY,
    SURNAME VARCHAR(255),
    DEPARTMENT_ID INT,
    SALARY DECIMAL(10, 2),
    FOREIGN KEY (DEPARTMENT_ID) REFERENCES Departments(DEPARTMENT_ID)
);

INSERT INTO Users (ID, SURNAME, DEPARTMENT_ID, SALARY) VALUES
(1, 'Алексеев', 3, 50000.00),
(2, 'Петрухин', 3, 60000.00),
(3, 'Есенин', 2, 70000.00),
(4, 'Маяковский', 1, 80000.00),
(5, 'Нортон', 4, 90000.00),
(6, 'Антропов', 1, 100000.00),
(7, 'Андреев', 4, 110000.00),
(8, 'Силантьев', 1, 120000.00);


CREATE TABLE Department (
    ID INT PRIMARY KEY,
    DEPARTMENT_NAME VARCHAR(255)
);

INSERT INTO Department (ID, DEPARTMENT_NAME) VALUES
(1, 'Backend'),
(2, 'DevOps'),
(3, 'Android'),
(4, 'iOS');
