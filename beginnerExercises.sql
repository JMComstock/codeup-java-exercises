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


