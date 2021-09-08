CREATE TABLE task (
	id bigint PRIMARY KEY auto_increment,
	title varchar(200),
	description TEXT,
	points int
);


INSERT INTO task (title, description, points) VALUES 
	('Criar banco de dados',
	'Criar um banco de dados na nuvem com Oracle', 
	200);
	
	
INSERT INTO task (title, description, points) VALUES 
	('Protótipo','Criação de protótipo de alta fidelidade', 100);
	
INSERT INTO task (title, description, points) VALUES 
	('API REST','Publicação de API com endpoints da aplicação', 150);