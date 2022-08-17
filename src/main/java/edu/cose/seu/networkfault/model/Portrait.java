package edu.cose.seu.networkfault.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("portrait")
@Data
public class Portrait {
    @TableId
    public Integer portrait_id;

    @TableField("province")
    public String province;

    @TableField("city")
    public String city;

    @TableField("county")
    public String county;

    @TableField("time")
    public Integer time;
}
