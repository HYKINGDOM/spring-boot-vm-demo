package com.java.talent.platform.vm.service.impl;

import com.java.talent.platform.vm.entity.CreatorInfo;
import com.java.talent.platform.vm.dao.CreatorInfoDao;
import com.java.talent.platform.vm.entity.CreatorSimpleInfo;
import com.java.talent.platform.vm.service.CreatorInfoService;
import jakarta.annotation.Resource;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 * @author kscs
 */
@Service
public class CreatorInfoServiceImpl implements CreatorInfoService {

    @Resource
    private CreatorInfoDao creatorInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param creatorId 主键
     *
     * @return 实例对象
     */
    @Override
    public CreatorInfo queryById(String creatorId) {
        return creatorInfoDao.queryByCreatorId(creatorId);
    }


    @Override
    public List<CreatorSimpleInfo> queryAllSimpleInfo() {
        return creatorInfoDao.queryAllSimpleInfo();
    }


}
