-- User Creation in Pluggable DB
CREATE USER edarest IDENTIFIED BY gogreen;
GRANT CREATE TABLE TO edarest;
SELECT username, account_status FROM dba_users WHERE username = 'EDAREST';
GRANT ALL PRIVILEGES TO edarest;
-- Table and Sequence Creation
CREATE TABLE token
(
	token_id number(10) NOT NULL,
	status varchar2(16) NOT NULL,
	requestor varchar2(16) NOT NULL,
	creation_date DATE,
	last_updated DATE,
	CONSTRAINT token_pk PRIMARY KEY (token_id)
);

CREATE SEQUENCE token_id_seq
    INCREMENT BY 1
    START WITH 10000
    MINVALUE 10000
    MAXVALUE 1000000000
    CYCLE
    CACHE 2;