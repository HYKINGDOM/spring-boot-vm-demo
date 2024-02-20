package com.java.talent.platform.vm.service.impl;

import com.java.talent.platform.vm.dao.CreatorInfoDao;
import com.java.talent.platform.vm.entity.CreatorInfo;
import com.java.talent.platform.vm.service.CreatorInfoService;
import jakarta.annotation.Resource;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
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
    public List<CreatorInfo> queryAllSimpleInfo() {

        List<CreatorInfo> creatorInfos = creatorInfoDao.queryAllSimpleInfo();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return creatorInfos.stream().sorted(Comparator.comparing(CreatorInfo::getCreatorId))
            .collect(Collectors.toList());
    }

}
