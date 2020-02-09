package com.education.base.service;

import com.education.base.dao.LabelDao;
import com.education.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.IdWorker;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LabelService  {
    @Autowired
    private LabelDao labelDao;

    @Autowired
    private IdWorker idWorker;


    //查询所有标签
    public List<Label> findAll(){
        return labelDao.findAll();
   }

   //通过id查询
   public Label findById(String id){
        return labelDao.findOne(id);
    }
    //保存
   public  Label save(Label label){
        label.setId(idWorker.nextId());
       return labelDao.save(label);
    }


}
