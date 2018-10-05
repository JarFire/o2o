package com.scnu.o2o.dao;

import com.scnu.o2o.BaseTest;
import com.scnu.o2o.domain.AreaExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AreaDaoTest extends BaseTest {
    @Autowired
    AreaMapper areaMapper;
    @Test
    public void test(){
        AreaExample areaExample = new AreaExample();
        areaExample.createCriteria();
        areaMapper.selectByExample(areaExample);

    }
}
