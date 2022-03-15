-- for a complete list of MySQL commands, refer to the documentation @ https://dev.mysql.com/doc/

-- Check the version of mysql
mysql --version

-- Check the status of the server
mysql.server status

-- Start the server
mysql.server start

-- Stop the server
mysql.server stop

-- login to mysql instance
mysql -u root -p
-- after login , type in password and hit enter

-- if having brew installed, upgrade mysql using brew
brew upgrade mysql

-- exit from mysql while it is running
exit;

-- QUERY commands
SELECT * FROM mysql.user;
SELECT * FROM mysql.user \G;
SELECT user, host FROM mysql.user;
SELECT user, host FROM mysql.user \G;
SELECT * FROM mysql.help_topic;
SELECT * FROM mysql.help_topic \G;
SELECT help_topic_id, help_category_id, url FROM mysql.help_topic;
SELECT help_topic_id, help_category_id, url FROM mysql.help_topic \G;

--tell mysql to use pager for output
-- A pager is a terminal program designed to handle multiple pages of output.
pager --less SFX;

-- use the following keys to navigate in less:
d -- go down a half page
u -- go up a half page
j -- scroll down one line
k -- scroll up one line
/ -- search for a term

-- EXIT the pager
q

-- undo previous pager setting
nopager

-- quick shutdown of mysql
control + z

-- different help content
help contents;
-- select different contents in the help menus
help <item> -- i.e. --> help Account Management

-- check the current user logged in
SELECT current_user;

-- check the user and host list on the server
SELET user, host FROM mysql.user;

-- CREATE a USER
CREATE USER 'testUser'@'localhost';

-- SHOW current user
SELECT user();

-- DELETE a specific USER
DROP USER 'testUser'@'localhost';

-- CREATE USER w/ PASSWORD
CREATE USER 'billy'@'localhost' IDENTIFIED BY 'billysSecretP@ass123';

-- UPDATE A USER to add a password to a user who doesn't have a password
ALTER USER 'noPasswordGuy'@'localhost' IDENTIFIED BY 'password';

-- CREATE a user a different way
CREATE USER 'remoteUser'@'192.168.01.01' IDENTIFIED BY 'remoteuser';

-- GRANT permissions
GRANT ALL
GRANT SELECT, INSERT, UPDATE, DELETE

-- SHOW privileges for a specific user
SHOW GRANTS for 'testUser'@'localhost'

-- GRANT SELECT COMMAND ON DATABASE.TABLE(mysql.user) TO USER('testUser'@'localhost')
GRANT SELECT ON mysql.user TO 'testUser'@'localhost';

-- GRANT SELECT privilege on any database and any table
GRANT SELECT ON *.*

-- how to create another a SUPER ROOT user
CREATE USER 'databaseAdmin'@'localhost' IDENTIFIED BY 'securepw';
GRANT ALL ON *.* to 'databaseAdmin'@'localhost' WITH GRANT OPTION;

-- show all permissions for a specific user
SHOW GRANTS FOR 'databaseAdmin'@'localhost' \G;

-- TODO: Create a new user called joe that can log in from localhost. Give joe a memorable password. Do not grant any privileges to joe.
CREATE USER 'joe'@'localhost' IDENTIFIED BY 'pass'
-- TODO: Use the query we gave you at the beginning of the lesson to make sure joe has been created and has a password
SELECT user, host FROM mysql.user;
-- TODO: Exit mysql and then connect again as joe.
exit;
mysql -u joe -p
-- enter password of pass
-- TODO: Try the same SELECT query again and see the results. What results are you getting? Why?
SELECT user, host FROM mysql.user;
ERROR 1142 (42000): SELECT command denied to user 'joe'@'localhost' for table 'user'
-- the reason for this error is that joe does not have permissions to access this information

--TODO: Create a new user named anne. Give anne her own password.
CREATE USER 'anne'@'localhost' IDENTIFIED BY 'pass';
--TODO: Grant all privileges to anne on mysql.user. Do not give her the ability to grant those privileges to others.
GRANT ALL ON mysql.user to 'anne'@'localhost';
-- TODO: Exit, and then connect as anne.
exit;
mysql -u anne -p
-- enter pass of (pass)
-- TODO: Run the query to list all users from this lesson. Why does this work?
SELECT user, host FROM mysql.user;
-- this works because anne was granted all privileges in mysql.user
-- TODO: Create a user named sally and try to grant sally all permissions on the mysql.user table. Does this work?
CREATE USER 'sally'@'localhost';
GRANT ALL ON mysql.user TO 'sally'@'localhost';
-- ERROR 1142 (42000): GRANT command denied to user 'anne'@'localhost' for table 'user'
-- TODO: Create a new user named jean. Give jean a sensible password.
CREATE USER 'jean'@'localhost' IDENTIFIED BY 'pass';
-- TODO: Give jean read-only permissions to the entire database server.
GRANT SELECT ON *.* TO 'jean'@'localhost';
-- TODO: Copy and paste the following query.
--  INSERT INTO mysql.user (Host, User) VALUES ('localhost', 'randal');
--  What is the result? Why?
-- ERROR 1142 (42000): INSERT command denied to user 'jean'@'localhost' for table 'user'
-- user jean only has read only permissions, they can not execute commands but only read info in all servers
-- TODO: Drop all our previous users:
-- joe
-- mark
-- anne
-- jean
-- sally
DROP USER 'joe'@'localhost', 'anne'@'localhost', 'jean'@'localhost'; -- mark and sally were previously dropped
--TODO: Create a new database administrator.
-- This user should have all permissions on all tables, as well as the ability to grant permissions to other users.
-- The username should be the same as the username on your mac. You can run the command whoami (from your shell, not from mysql) to find this out if you are not sure.
CREATE USER 'jason'@'localhost' IDENTIFIED BY 'pass';
GRANT ALL ON *.* TO 'jason'@'localhost' WITH GRANT OPTION;
-- TODO: If you are trying to log in to MySQL as a user that has the same username as the user you are logged in to your computer as, you will not need to specify the -u option.
--  If you followed the above steps, you should be able to connect to MySQL with just:
--  mysql -p

-- CREATE a new database
CREATE DATABASE database_name_db;
--SHOW all databases
SHOW DATABASES;
--SHOW current database
SELECT database();
-- CREATE database IF it doesn't already have a name is the list of databases
CREATE DATABASE IF NOT EXISTS sirius_example_db;
-- Enter into a specific database
USE sirius_example_db;
-- SHOW tables in the database
SHOW TABLES;
-- DELETE database;
DROP DATABASE sirius_example_db;
-- commands to show how database was created
SHOW CREATE DATABASE database_name;












