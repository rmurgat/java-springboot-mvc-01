	SELECT * from movies

	ALTER TABLE movies
	add column stocklist_id int not null,
	add foreign key (stocklist_id) references stocklist(id);

	CREATE TABLE movies (
	    id int primary key auto_increment,
	    name varchar(200) not null,
	    description varchar(300) not null,
	    image varchar(500),
	    stocklist_id int not null,
	    unique (id)
	);

	CREATE TABLE stocklist (
	    id int primary key auto_increment,
	    name varchar(200) not null,
	    http_web varchar(500),
	    unique (id)
	);

	SELECT * FROM stocklist

	INSERT stocklist(name, http_web) VALUES ('Blim', 'https://www-stage.blim.com/inicio')

	UPDATE movies SET stocklist_id = 1 WHERE id in (1,3,5,7)
	UPDATE movies SET stocklist_id = 2 WHERE  id in (2,4)
	UPDATE movies SET stocklist_id = 3 WHERE  id in (6)

	INSERT INTO movies(name, description, image, stocklist_id) VALUES ('The Whale', 'n a town in Idaho, Charlie, a reclusive and unhealthy English teacher, hides out in his flat and eats his way to death.', 'https://flim-1-0-2.s3.eu-central-1.amazonaws.com/thumbs/hd_720px/982c682cdbed11ea84df10ddb1aba44f.jpeg',4)
	INSERT INTO movies(name, description, image, stocklist_id) VALUES ('Flash Gordon', 'n a town in Idaho, Charlie, a reclusive and unhealthy English teacher, hides out in his flat and eats his way to death.', 'https://www.thescarboroughnews.co.uk/webimg/QVNIMTE2NjU2MzMy.jpg?width=1200&enable=upscale',5)
	INSERT INTO movies(name, description, image, stocklist_id) VALUES ('Total Recall', 'TOTAL RECALL represents one of the iconic composer’s last masterpieces, recorded with the National Philharmonic Orchestra of London, under his own baton.', 'https://m.media-amazon.com/images/M/MV5BYzU1YmJjMGEtMjY4Yy00MTFlLWE3NTUtNzI3YjkwZTMxZjZmXkEyXkFqcGdeQXVyNDc2NjEyMw@@._V1_FMjpg_UX1000_.jpg',5)

