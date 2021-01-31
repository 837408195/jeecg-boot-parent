package org.jeecg.modules.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("app_version")
public class APPUpdate {
    /**
     * ID
     */
    @TableId(type = IdType.ID_WORKER_STR)
    private String id;

    private String app;

    private Integer versionCode;

    private String versionInfo;

    private Integer forceUpdate;

    private String androidUrl;

    private String iosUrl;
}
