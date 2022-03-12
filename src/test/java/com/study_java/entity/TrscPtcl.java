package com.study_java.entity;


import com.study_java.entity.keys.TrscPtclKeys;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@IdClass(TrscPtclKeys.class)
@Entity
@Table(name="TRSC_PTCL")
public class TrscPtcl {

    @Id
    @Column(name="TRSC_DT", length = 8)
    private String trscDt;

    @Id
    @Column(name="ACCT_NO", length = 10)
    private String acctNo;

    @Id
    @Column(name="TRSC_NO")
    private int trscNo;

    @Column(name="AMT")
    private BigDecimal amt;

    @Column(name="COMM")
    private BigDecimal comm;

    @Column(name="CAN_YN")
    private String canYN;
}