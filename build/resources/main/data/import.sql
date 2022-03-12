INSERT INTO TRSC_PTCL(TRSC_DT,ACCT_NO,TRSC_NO,AMT,COMM,CAN_YN)
SELECT *
FROM CSVREAD('classpath:data/trsc_ptcl.csv', NULL, 'charset=UTF-8');

INSERT INTO ACCT_INFO(ACCT_NO, ACCT_NM, MGNT_BR_CD)
SELECT *
FROM CSVREAD('classpath:data/acct_info.csv', NULL, 'charset=UTF-8');

INSERT INTO MGNT_BR_INFO(MGNT_BR_CD, MGNT_BR_NM)
SELECT *
FROM CSVREAD('classpath:data/mgnt_br_info.csv', NULL, 'charset=UTF-8');
