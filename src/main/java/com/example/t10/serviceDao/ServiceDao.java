package com.example.t10.serviceDao;

import com.example.t10.entity.Cursa;
import com.example.t10.service.ICursa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceDao implements IDao {
    @Autowired
    ICursa iCursa;
    @Override
    public List<Cursa> findAll() {
        return iCursa.findAll();
    }
}
