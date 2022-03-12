package com.study_java.dao;

import com.study_java.entity.AcctInfo;
import com.study_java.entity.TrscPtcl;
import com.study_java.entity.keys.TrscPtclKeys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AcctInfoRepository extends CrudRepository<AcctInfo, String> {
}