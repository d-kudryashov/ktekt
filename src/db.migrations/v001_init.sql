CREATE DATABASE ktekt
WITH OWNER = postgres
ENCODING = 'UTF8'
LC_COLLATE = 'Russian_Russia.1251'
LC_CTYPE = 'Russian_Russia.1251'
CONNECTION LIMIT = -1;
GRANT ALL ON DATABASE ktekt TO postgres;
REVOKE ALL ON DATABASE ktekt FROM public;

CREATE SEQUENCE hibernate_sequence;