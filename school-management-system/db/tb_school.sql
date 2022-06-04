CREATE TABLE tb_student (
	id serial PRIMARY KEY,
	st_id VARCHAR ( 50 ) UNIQUE NOT NULL,
	st_first_name VARCHAR ( 50 ) NOT NULL,
	st_last_name VARCHAR (50) NOT NULL,
	st_email VARCHAR ( 255 ),
	st_gender VARCHAR ( 1 ) NOT NULL,
	st_date_of_birth VARCHAR ( 20 ) NOT NULL,
	created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    status BOOLEAN
);

CREATE TABLE tb_class_student (
	id serial PRIMARY KEY,
	st_id INT NOT NULL,
	cl_id INT NOT NULL,
	status BOOLEAN,
	created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL
);