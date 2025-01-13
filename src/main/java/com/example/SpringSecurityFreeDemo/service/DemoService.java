package com.example.SpringSecurityFreeDemo.service;

import com.example.SpringSecurityFreeDemo.model.DemoModel;
import com.example.SpringSecurityFreeDemo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {
    @Autowired
    private DemoRepository demoRepository;

    public DemoModel createDemo(DemoModel demoModel) {

        DemoModel demo = new DemoModel();
        demo.setName(demoModel.getName());

        DemoModel savedDemo = demoRepository.save(demo);

        return savedDemo;
    }

    public List<DemoModel> getDemos() {
        return demoRepository.findAll();
    }
}