package com.education.base.controller;

import com.education.base.pojo.Label;
import com.education.base.service.LabelService;
import entry.Result;
import entry.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin   //设置跨域
@RequestMapping("/label")
public class BaseController {
    @Autowired
    private LabelService labelService;

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public Result findAll(){
        List<Label> list = labelService.findAll();
        return new Result(true, StatusCode.OK,"查询成功",list);
    }

    @RequestMapping(value = "/{labelId}",method = RequestMethod.GET)
    public  Result findById(@PathVariable String labelId){
        return new Result(true, StatusCode.OK,"查询成功");
    }

    @RequestMapping(value = "save",method = RequestMethod.POST)
    public  Result save ( ){
        Label label = new Label();
        label.setCount(150);
        label.setFans(300);
        label.setLabelname("Java");
        label.setRecommend(0);
        label.setState(1);
        labelService.save(label);
        return new Result(true, StatusCode.OK,"保存成功");
    }

    @RequestMapping(value = "/{labelId}",method = RequestMethod.PUT)
    public  Result update (@PathVariable String labelId,@RequestBody Label label){

        return new Result(true, StatusCode.OK,"修改成功");
    }

    @RequestMapping(value = "/{labelId}",method = RequestMethod.DELETE)
    public  Result deleteById (@PathVariable String labelId){
        return new Result(true, StatusCode.OK,"删除成功");
    }
}
