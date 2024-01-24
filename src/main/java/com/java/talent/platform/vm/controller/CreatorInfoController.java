package com.java.talent.platform.vm.controller;

import com.java.talent.platform.vm.common.R;
import com.java.talent.platform.vm.entity.CreatorInfo;
import com.java.talent.platform.vm.service.CreatorInfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/creatorInfo")
public class CreatorInfoController {

    @Autowired
    private CreatorInfoService creatorInfoService;

    @GetMapping("/{creatorId}")
    public R<CreatorInfo> queryById(@PathVariable("creatorId") String creatorId) {
        return R.ok(creatorInfoService.queryById(creatorId));
    }

    /**
     * 分页查询
     *
     * @param creatorInfo 筛选条件
     *
     * @return 查询结果
     */

    @PostMapping("/query")
    public R<List<CreatorInfo>> pagingQuery(@RequestBody CreatorInfo creatorInfo) {
        return R.ok(creatorInfoService.listQuery(creatorInfo));
    }

    /**
     * 新增数据
     *
     * @param creatorInfo 实例对象
     *
     * @return 实例对象
     */
    @PostMapping
    public ResponseEntity<CreatorInfo> add(CreatorInfo creatorInfo) {
        return ResponseEntity.ok(creatorInfoService.insert(creatorInfo));
    }

    /**
     * 更新数据
     *
     * @param creatorInfo 实例对象
     *
     * @return 实例对象
     */
    @PutMapping
    public ResponseEntity<CreatorInfo> edit(CreatorInfo creatorInfo) {
        return ResponseEntity.ok(creatorInfoService.update(creatorInfo));
    }

    /**
     * 通过主键删除数据
     *
     * @param creatorId 主键
     *
     * @return 是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String creatorId) {
        return ResponseEntity.ok(creatorInfoService.deleteById(creatorId));
    }
}