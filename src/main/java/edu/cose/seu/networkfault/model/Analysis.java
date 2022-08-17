package edu.cose.seu.networkfault.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("analysis")
@Data
public class Analysis {

    @TableId
    public Integer analysis_id;

    @TableField("province")
    public String province;

    @TableField("city")
    public String city;

    @TableField("county")
    public String county;

    @TableField("fault_1")
    public String fault_1;

    @TableField("fault_2")
    public String fault_2;

    @TableField("fault_rate")
    public Integer fault_rate;

    @TableField("again_rate")
    public Integer again_rate;
}
