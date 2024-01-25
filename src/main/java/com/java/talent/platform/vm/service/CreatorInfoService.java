package com.java.talent.platform.vm.service;

import com.java.talent.platform.vm.entity.CreatorInfo;
import com.java.talent.platform.vm.entity.CreatorInfoVO;
import java.util.List;
import java.util.Map;

/**
 * @author kscs
 */
public interface CreatorInfoService {


    CreatorInfo queryById(String creatorId);

    /**
     * 分页查询
     *
     * @param creatorInfo 筛选条件
     *
     * @return 查询结果
     */
    List<CreatorInfo> listQuery(CreatorInfo creatorInfo);


    List<Map<String, Object>> queryAllSimpleInfo();

    /**
     * 新增数据
     *
     * @param creatorInfo 实例对象
     *
     * @return 实例对象
     */
    CreatorInfo insert(CreatorInfo creatorInfo);

    /**
     * 更新数据
     *
     * @param creatorInfo 实例对象
     *
     * @return 实例对象
     */
    CreatorInfo update(CreatorInfo creatorInfo);

    /**
     * 通过主键删除数据
     *
     * @param creatorId 主键
     *
     * @return 是否成功
     */
    boolean deleteById(String creatorId);
}
