package com.java.talent.platform.vm.service;

import com.java.talent.platform.vm.entity.CreatorInfo;
import com.java.talent.platform.vm.entity.CreatorInfoVO;
import com.java.talent.platform.vm.entity.CreatorSimpleInfo;
import java.util.List;
import java.util.Map;

/**
 * @author kscs
 */
public interface CreatorInfoService {


    CreatorInfo queryById(String creatorId);



    List<CreatorInfo> queryAllSimpleInfo();

}
