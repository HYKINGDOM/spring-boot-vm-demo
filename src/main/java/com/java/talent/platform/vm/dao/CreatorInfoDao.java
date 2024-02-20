package com.java.talent.platform.vm.dao;

import com.java.talent.platform.vm.entity.CreatorInfo;
import com.java.talent.platform.vm.entity.CreatorSimpleInfo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * 达人信息表;(creator_info)表数据库访问层
 *
 * @author : meta
 */
@Repository
public interface CreatorInfoDao extends JpaRepository<CreatorInfo, Long> {
    /**
     * 通过ID查询单条数据
     *
     * @param creatorId 主键
     *
     * @return 实例对象
     */
    @Query("SELECT c FROM CreatorInfo c WHERE c.creatorId = :creatorId")
    CreatorInfo queryByCreatorId(@Param("creatorId") String creatorId);

    /**
     * 查询简单所有数据
     *
     * @return
     */
    @Query(value = "select creatorId,creatorName from CreatorInfo")
    List<CreatorSimpleInfo> queryAllSimpleInfo();

}
