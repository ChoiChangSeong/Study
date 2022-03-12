package com.study_java.entity.keys;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
public class TrscPtclKeys implements Serializable {
    private String trscDt;

    private String acctNo;

    private int trscNo;

}
