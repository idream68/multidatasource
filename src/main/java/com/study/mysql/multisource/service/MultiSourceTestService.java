package com.study.mysql.multisource.service;

import com.study.mysql.multisource.mapper.PrimaryMapper;
import com.study.mysql.multisource.mapper.SecondMapper;
import com.study.mysql.multisource.mapper.ThirdMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MultiSourceTestService {
    @Resource
    PrimaryMapper primaryMapper;
    @Resource
    SecondMapper secondMapper;
    @Resource
    ThirdMapper thirdMapper;

    public int getPrimaryData() {
        return primaryMapper.getCount();
    }

    public int getSecondData() {
        return secondMapper.getCount();
    }

    public int getThirdData() {
        return thirdMapper.getCount();
    }

}
