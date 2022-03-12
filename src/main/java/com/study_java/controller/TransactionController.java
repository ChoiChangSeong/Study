package com.study_java.controller;

import com.study_java.dao.TrscPtclRepository;
import com.study_java.entity.TrscPtcl;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    private TrscPtclRepository repository;
    public TransactionController(TrscPtclRepository repository) {
        this.repository = repository;
    }

    @PutMapping("/ptcl")
    public TrscPtcl putPTCL(TrscPtcl ptcl){
        return repository.save(ptcl);
    }

}
