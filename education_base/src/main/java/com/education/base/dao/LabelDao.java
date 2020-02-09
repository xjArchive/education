package com.education.base.dao;

import com.education.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LabelDao  extends JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {

}
