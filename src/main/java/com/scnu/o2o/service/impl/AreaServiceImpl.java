package com.scnu.o2o.service.impl;

import com.scnu.o2o.dao.AreaMapper;
import com.scnu.o2o.domain.Area;
import com.scnu.o2o.domain.AreaExample;
import com.scnu.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaServiceImpl implements AreaService  {
    @Autowired
    private AreaMapper areaMapper;
    @Override
    public List<Area> getAllAreas() {
        AreaExample areaExample = new AreaExample();
        areaExample.createCriteria();
        return areaMapper.selectByExample(areaExample);
    }
}
