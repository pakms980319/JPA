create table Exam_Visitor (
	visitor_id	varchar(255)	primary key,
	email		varchar(50)		default null,
	user_device	varchar(15)		not null,
	referer		varchar(100)	not null,
	request_uri	varchar(100)	not null,
	client_ip	varchar(50)		not null
);



drop table exam_visitor;

create table exam_visitor (
	visitorId	varchar(255)	primary key,
	email		varchar(50)		default null,
	userDevice	varchar(15)		not null,
	referer		varchar(100)	not null,
	requestURI	varchar(100)	not null,
	clientIP	varchar(50)		not null
);

select * from exam_visitor;

drop table book;

create table Book (
	isbn	varchar(10)	primary key,
	title	varchar(100)	not null,
	price	int	not null,
	author	varchar(30)	not null,
	press	varchar(30)	not null
);

select * from book;
