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
SELECT * FROM mysql.user;git
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







