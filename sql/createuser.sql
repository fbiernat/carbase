DROP USER 'carbaseadmin'@'localhost';

CREATE USER 'carbaseadmin'@'localhost' IDENTIFIED BY 'carbaseadmin';
GRANT ALL PRIVILEGES ON persondb.* TO 'carbaseadmin'@'localhost';
GRANT ALL PRIVILEGES ON cardb.* TO 'carbaseadmin'@'localhost';
GRANT ALL PRIVILEGES ON carsharingdb.* TO 'carbaseadmin'@'localhost';
GRANT ALL PRIVILEGES ON carbase.* TO 'carbaseadmin'@'localhost';
