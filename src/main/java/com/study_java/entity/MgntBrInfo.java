package com.study_java.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="MGNT_BR_INFO")
@Entity
@Data
public class MgntBrInfo {
    @Column(name = "MGNT_BR_CD", length = 1)
    @Id
    private String mgntBrCd;

    @Column(name="MGNT_BR_NM", length = 20)
    private String mgntBrNm;
}
