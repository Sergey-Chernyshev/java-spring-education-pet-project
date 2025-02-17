-- Liquibase ChangeSet 3
-- Author: your_username
-- Change: Add 10 mock users to the users table

INSERT INTO users (first_name, last_name, height, role)
VALUES
    ('John', 'Doe', 175.5, 'USER'),
    ('Jane', 'Doe', 165.0, 'USER'),
    ('Alice', 'Smith', 160.0, 'ADMIN'),
    ('Bob', 'Johnson', 180.5, 'USER'),
    ('Charlie', 'Brown', 170.0, 'USER'),
    ('David', 'Williams', 182.0, 'ADMIN'),
    ('Eve', 'Davis', 162.5, 'USER'),
    ('Frank', 'Miller', 177.0, 'USER'),
    ('Grace', 'Wilson', 168.0, 'ADMIN'),
    ('Hannah', 'Moore', 158.5, 'USER');