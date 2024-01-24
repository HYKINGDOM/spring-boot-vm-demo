package com.java.talent.platform.vm.mapper;


import com.java.talent.platform.vm.entity.CreatorInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 达人信息表;(creator_info)表数据库访问层
 * @author : meta
 */
@Mapper
public interface CreatorInfoMapper{
    /**
     * 通过ID查询单条数据
     *
     * @param creatorId 主键
     * @return 实例对象
     */
    CreatorInfo queryById(String creatorId);
    /**
     * 分页查询指定行数据
     *
     * @param creatorInfo 查询条件
     * @return 对象列表
     */
    List<CreatorInfo> queryAllByLimit(CreatorInfo creatorInfo);
    /**
     * 统计总行数
     *
     * @param creatorInfo 查询条件
     * @return 总行数
     */
    long count(CreatorInfo creatorInfo);
    /**
     * 新增数据
     *
     * @param creatorInfo 实例对象
     * @return 影响行数
     */
    int insert(CreatorInfo creatorInfo);
    /**
     * 批量新增数据
     *
     * @param entities List<CreatorInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CreatorInfo> entities);
    /**
     * 批量新增或按主键更新数据
     *
     * @param entities List<CreatorInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<CreatorInfo> entities);
    /**
     * 更新数据
     *
     * @param creatorInfo 实例对象
     * @return 影响行数
     */
    int update(CreatorInfo creatorInfo);
    /**
     * 通过主键删除数据
     *
     * @param creatorId 主键
     * @return 影响行数
     */
    int deleteById(String creatorId);
}
