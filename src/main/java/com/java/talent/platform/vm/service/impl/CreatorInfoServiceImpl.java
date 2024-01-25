package com.java.talent.platform.vm.service.impl;

import com.java.talent.platform.vm.entity.CreatorInfo;
import com.java.talent.platform.vm.entity.CreatorInfoVO;
import com.java.talent.platform.vm.mapper.CreatorInfoMapper;
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
    private CreatorInfoMapper creatorInfoMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param creatorId 主键
     *
     * @return 实例对象
     */
    @Override
    public CreatorInfo queryById(String creatorId) {
        return creatorInfoMapper.queryById(creatorId);
    }

    /**
     * 分页查询
     *
     * @param creatorInfo 筛选条件
     *
     * @return 查询结果
     */
    @Override
    public List<CreatorInfo> listQuery(CreatorInfo creatorInfo) {
        long total = creatorInfoMapper.count(creatorInfo);
        return creatorInfoMapper.queryAllByLimit(creatorInfo);
    }

    @Override
    public List<Map<String, Object>> queryAllSimpleInfo() {
        return creatorInfoMapper.queryAllSimpleInfo();
    }

    /**
     * 新增数据
     *
     * @param creatorInfo 实例对象
     *
     * @return 实例对象
     */
    @Override
    public CreatorInfo insert(CreatorInfo creatorInfo) {
        creatorInfoMapper.insert(creatorInfo);
        return creatorInfo;
    }

    /**
     * 更新数据
     *
     * @param creatorInfo 实例对象
     *
     * @return 实例对象
     */
    @Override
    public CreatorInfo update(CreatorInfo creatorInfo) {
        creatorInfoMapper.update(creatorInfo);
        return queryById(creatorInfo.getCreatorId());
    }

    /**
     * 通过主键删除数据
     *
     * @param creatorId 主键
     *
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String creatorId) {
        int total = creatorInfoMapper.deleteById(creatorId);
        return total > 0;
    }
}
