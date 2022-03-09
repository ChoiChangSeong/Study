create table TRSC_PTCL(
TRSC_DT VARCHAR(8) DEFAULT '' NOT NULL,
ACCT_NO VARCHAR(20) DEFAULT '' NOT NULL,
TRSC_NO INT AUTO_INCREMENT,
AMOUNT NUMERIC(18,2) DEFAULT 0 NOT NULL,
COMM NUMERIC(18,2) DEFAULT 0 NOT NULL,
CAN_YN VARCHAR(1) DEFAULT '0' NOT NULL,
PRIMARY KEY (TRSC_DT, ACCT_NO, TRSC_NO)
);