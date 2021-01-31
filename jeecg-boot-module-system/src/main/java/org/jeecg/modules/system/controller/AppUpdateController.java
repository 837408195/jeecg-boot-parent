package org.jeecg.modules.system.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jeecg.common.api.vo.Result;
import org.jeecg.modules.system.entity.APPUpdate;
import org.jeecg.modules.system.service.AppUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "app版本")
@RestController
@RequestMapping("/app")
public class AppUpdateController {
    @Autowired
    AppUpdateService appUpdateService;

    @ApiOperation(value = "获取app版本信息")
    @GetMapping("/queryAppVersion")
    public Result<?> queryAppVersion(@RequestParam String app) {
        APPUpdate appUpdate = appUpdateService.queryAppVersion(app);
        if (appUpdate == null) {
            return Result.error("未找到对应数据");
        } else {
            return Result.ok(appUpdate);
        }
    }
}
