package com.cbcb.Service;

import com.cbcb.Mapper.HelloMapper;
import com.cbcb.Model.HelloModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 晨边#CB
 * @Date:created in  2019/11/19 16:08
 * @Version V1.0
 **/
@Service
public class HelloService {

    private final HelloMapper dao;

    @Autowired
    public HelloService(HelloMapper dao) {
        this.dao = dao;
    }

    public boolean insert(HelloModel model) {
        return dao.insert(model) > 0;
    }

    public HelloModel select(int id) {
        return dao.select(id);
    }

    public List<HelloModel> selectAll() {
        return dao.selectAll();
    }

    public boolean updateValue(HelloModel model) {
        return dao.updateValue(model) > 0;
    }

    public boolean delete(Integer id) {
        return dao.delete(id) > 0;
    }
}
