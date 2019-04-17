INSERT INTO product(id,NAME,description) VALUES (1,'Gubee Integrador','test.test.com');
INSERT INTO product(id,NAME,description) VALUES (2,'Gubee Fretes','Ferramenta de integracao para marketplaces');
INSERT INTO product(id,NAME,description) VALUES (3,'Gubee Fretes','Ferramenta de integracao para marketplaces');
INSERT INTO product(id,NAME,description) VALUES (4,'Gubee AntiFraude','Ferramenta especialistas em detecção e prevencao a fraude');
INSERT INTO target_market(id,NAME) VALUES (1,'Ecommerce');
INSERT INTO target_market(id,NAME) VALUES (2,'ERP');
INSERT INTO target_market(id,NAME) VALUES (3,'Lojista que nao desejam possuir ecommerce');
INSERT INTO target_market(id,NAME) VALUES (4,'Loja fisica');
INSERT INTO target_market(id,NAME) VALUES (5,'Telecom');
INSERT INTO target_market(id,NAME) VALUES (6,'Venda direta');
INSERT INTO target_market(id,NAME) VALUES (7,'Mobile First');
INSERT INTO target_market(id,NAME) VALUES (8,'Digital Onboarding');
INSERT INTO TECHNOLOGY(id,NAME) VALUES (1,'Java 10');
INSERT INTO TECHNOLOGY(id,NAME) VALUES (2,'Kotlin');
INSERT INTO TECHNOLOGY(id,NAME) VALUES (3,'Kafka');
INSERT INTO TECHNOLOGY(id,NAME) VALUES (4,'Event Stream');
INSERT INTO TECHNOLOGY(id,NAME) VALUES (5,'Redis');
INSERT INTO TECHNOLOGY(id,NAME) VALUES (6,'MongoDB');
INSERT INTO TECHNOLOGY(id,NAME) VALUES (7,'NodeJS');
INSERT INTO TECHNOLOGY(id,NAME) VALUES (9,'Big Data Analytics');
INSERT INTO TECHNOLOGY(id,NAME) VALUES (10,'Hadoop');
INSERT INTO TECHNOLOGY(id,NAME) VALUES (11,'Pig');
INSERT INTO TECHNOLOGY(id,NAME) VALUES (12,'Cassandra');
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(1,1);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(1,2);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(1,3);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(2,1);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(2,2);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(2,4);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(3,1);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(3,2);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(3,4);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(4,1);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(4,5);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(4,6);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(4,7);
INSERT INTO PRODUCT_MARKET(PRODUCT_ID,MARKET_ID) VALUES(4,8);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(1,1);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(1,2);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(1,3);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(1,4);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(1,5);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(1,6);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(2,6);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(2,7);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(3,6);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(3,7);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(4,9);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(4,10);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(4,3);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(4,11);
INSERT INTO PRODUCT_STACK(PRODUCT_ID,STACK_ID) VALUES(4,12);