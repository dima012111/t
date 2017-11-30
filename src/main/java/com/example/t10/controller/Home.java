package com.example.t10.controller;

import com.example.t10.entity.Cursa;
import com.example.t10.service.ICursa;
import com.example.t10.serviceDao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class Home {

    @Autowired
    private ICursa iCursa;

    @RequestMapping("/cursa")
    public List<Cursa> findCurse() {
       return iCursa.findAll();
    }
}
