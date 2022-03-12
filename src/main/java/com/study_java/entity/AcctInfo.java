package com.study_java.entity;

import com.study_java.entity.keys.TrscPtclKeys;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="ACCT_INFO")
public class AcctInfo {
    @Column(name="ACCT_NO", length = 8)
    @Id
    private String acctNo;

    @Column(name="ACCT_NM", length=20)
    private String accNm;

    @Column(name="MGNT_BR_CD", length = 1)
    private String mgntBrCd;
}
