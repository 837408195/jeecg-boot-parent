package org.jeecg.modules.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jeecg.modules.system.entity.APPUpdate;
import org.jeecg.modules.system.mapper.AppUpdateMapper;
import org.jeecg.modules.system.service.AppUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUpdateServiceImpl extends ServiceImpl<AppUpdateMapper, APPUpdate> implements AppUpdateService {
    @Autowired
    private AppUpdateMapper appUpdateMapper;

    @Override
    public APPUpdate queryAppVersion(String app) {
        return appUpdateMapper.queryAppVersion(app);
    }
}
