package com.zds.springboot01.service;

import com.zds.springboot01.properties.TreeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreeService {
    @Autowired
    private TreeProperties treeProperties;

    public void getTreeProperties() {
        System.out.println(treeProperties);
    }
}
