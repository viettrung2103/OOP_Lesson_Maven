select * from employee;

select * from department;

DROP DATABASE IF EXISTS company2;
CREATE DATABASE company2;

GRANT SELECT, INSERT, UPDATE, DELETE ON company2.* TO 'metrouser'@'localhost';

GRANT CREATE, DROP ON company2.* TO 'metrouser'@'localhost';