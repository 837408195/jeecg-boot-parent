package org.jeecg.modules.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.jeecg.modules.system.entity.APPUpdate;


public interface AppUpdateService extends IService<APPUpdate> {

    APPUpdate queryAppVersion(String app);
}
