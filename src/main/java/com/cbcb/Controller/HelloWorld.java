package com.cbcb.Controller;

import com.cbcb.Model.HelloModel;
import com.cbcb.Model.ReqBody;
import com.cbcb.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 晨边#CB
 * @Date:created in  2019/11/19 16:11
 * @Version V1.0
 **/
@RestController
public class HelloWorld {

    private final HelloService HelloService;

    @Autowired
    public HelloWorld(HelloService HelloService) {
        this.HelloService = HelloService;

    }
    @RequestMapping("/")
    public String Index() {
        return "Hello World";
    }

    @RequestMapping("/list")
    public List<HelloModel> List() {

        return HelloService.selectAll();
    }


    @RequestMapping(value = "/post" ,method = RequestMethod.POST)
    public String Post(@RequestBody ReqBody map)throws  IOException{
        return "输入的姓名是:"+map.getName()+",电子邮件是:"+map.getEmail();
    }




}
