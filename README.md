# phonebookdemo
Basic implementation of phone book app

Underneath the hold tools or assest:

1 Spring boot
    
    *web
    *mysql
    *jpa
    *swagger
    *java version(1.8)
    *lombok
     
1 Relational Db: Mysql
    
    *Create Database indigo;
    *Creat Table
    `
    DROP TABLE IF EXISTS Phonebook;
     CREATE TABLE IF NOT EXISTS Phonebook (
       phonebookEntry_id int(11) NOT NULL AUTO_INCREMENT,
       entry_address varchar(255) DEFAULT NULL,
       entry_email varchar(255) DEFAULT NULL,
       entry_contactN varchar(11) DEFAULT NULL,
       entry_name varchar(255) DEFAULT NULL,
       PRIMARY KEY (phonebookEntry_id)
     ) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
     
     `
     
     Swagger endpoint:
     >> http://localhost:8080/phonebookdemo/swagger-ui.html
     >> http://localhost:8080/phonebookdemo/v2/api-docs


#
