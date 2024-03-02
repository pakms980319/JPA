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

drop table engmanmember;

CREATE TABLE EngmanMember (
	id			bigint			PRIMARY KEY	AUTO_INCREMENT,
	email 		varchar(100) 	NOT NULL,
	passwd 		varchar(60) 	NOT NULL,
	alias 		varchar(25) 	NOT NULL,
	imagePath 	varchar(255) 	NULL,
	memberRole 	varchar(20) 	NOT NULL,
	name		varchar(10) 	NOT NULL,
	phone 		varchar(20) 	NOT NULL 	DEFAULT '',
	sex 		char(1) 		NOT NULL 	DEFAULT 'X',
	birthDate 	DATE 			NOT NULL,
	regDate 	TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
	updateDate 	TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP		ON UPDATE CURRENT_TIMESTAMP
)auto_increment=1501;

select * from engmanmember;

-- --------------------------------------------------- 
-- 240224 
create table ExamUser1 (
	id			BIGINT			primary key auto_increment,
	email		VARCHAR(50)		not null,
	passwd		VARCHAR(60) 	not null,
	name		VARCHAR(10)		not null,
	phone		VARCHAR(11)		not null,
	address1	VARCHAR(20)		not null,
	address2	VARCHAR(60)		not null,
	postalCode	vARCHAR(5)		not null
) auto_increment = 1501;

select * from EXAMUSER1;




create table ExamUser (
	id			BIGINT			primary key auto_increment,
	email		VARCHAR(50)		not null,
	passwd		VARCHAR(60) 	not null,
	name		VARCHAR(10)		not null,
	phone		VARCHAR(11)		not null
) auto_increment = 1501;

create table ExamAddress (
	userId		BIGINT			not null,
	address1	VARCHAR(20)		not null,
	address2	VARCHAR(60)		not null,
	postalCode	vARCHAR(5)		not null,
	constraint ExamAddress_userId_FK foreign key (userId) references ExamUser (id)
)

select * from EXAMUSER;
select * from ExamAddress;

-- ========================================
-- 2024-02-25

-- ========================================
-- LibraryMember
-- ========================================
create table LibraryMember (
	email		varchar(30)		primary key,
	name		varchar(20)		not null,
	lendingAuth	bool			not null default true
);

-- ========================================
-- LibraryCard
-- ========================================
create table LibraryCard (
	cardNum		varchar(10)		primary key,
	ownerEmail	varchar(30)		not null,
	enabled		bool			not null default true,
	expiryDate	Date			not null,
	constraint LibraryCard_ownerEmail_FK foreign key(ownerEmail) references LibraryMember(email)
);

select * from LIBRARYCARD;
select * from librarymember;

-- ========================================




-- =====================================
-- 240302 실습 
-- =====================================

-- =====================================
-- Partner
-- =====================================
create table Partner (
	name			varchar(45),
	partnerType		varchar(45),
	phone			varchar(45),
	Address			varchar(45),
	homePage		varchar(45),
	status			varchar(45),
	repName			varchar(45),
	regDate			varchar(45),
	updateDate		varchar(45)
);

-- =====================================
-- Address
-- =====================================
create table Address (
	district		varchar(45),
	address1		varchar(45),
	address2		varchar(45),
	postalCode		varchar(45),
	regDate			varchar(45),
	updateDate		varchar(45)
);

select * from Partner;
select * from Address;



drop table Partner;
drop table Address;