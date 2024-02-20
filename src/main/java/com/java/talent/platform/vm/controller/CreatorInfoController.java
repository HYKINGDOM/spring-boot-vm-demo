package com.java.talent.platform.vm.controller;

import com.java.talent.platform.vm.common.R;
import com.java.talent.platform.vm.entity.CreatorInfo;
import com.java.talent.platform.vm.entity.CreatorSimpleInfo;
import com.java.talent.platform.vm.service.CreatorInfoService;
import jakarta.annotation.Resource;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kscs
 */
@RestController
@RequestMapping("/creatorInfo")
public class CreatorInfoController {

    @Resource
    private CreatorInfoService creatorInfoService;

    @GetMapping("/{creatorId}")
    public R<CreatorInfo> queryById(@PathVariable("creatorId") String creatorId) {
        return R.ok(creatorInfoService.queryById(creatorId));
    }


    @GetMapping("/info")
    public R<List<CreatorInfo>> getCreatorInfoVO() {
        return R.ok(creatorInfoService.queryAllSimpleInfo());
    }

}