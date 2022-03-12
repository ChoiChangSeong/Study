package com.study_java.dao;

import com.study_java.entity.MgntBrInfo;
import com.study_java.entity.TrscPtcl;
import com.study_java.entity.keys.TrscPtclKeys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MgntBrInfoRepository extends CrudRepository<MgntBrInfo, String> {
}