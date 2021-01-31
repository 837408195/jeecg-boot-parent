package org.jeecg.modules.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.system.entity.APPUpdate;


public interface AppUpdateMapper extends BaseMapper<APPUpdate> {
    APPUpdate queryAppVersion(@Param("app") String app);
}
