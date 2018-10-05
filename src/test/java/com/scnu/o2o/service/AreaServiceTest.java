package com.scnu.o2o.service;

import com.scnu.o2o.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AreaServiceTest extends BaseTest {
    @Autowired
    AreaService areaService;
    @Test
    public void test(){
        areaService.getAllAreas();
    }

}
