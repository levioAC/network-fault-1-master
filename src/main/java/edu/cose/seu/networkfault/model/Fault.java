package edu.cose.seu.networkfault.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("fault_data")
@Data
public class Fault {
    @TableId
    public Integer fault_id;

    @TableField("fault_type")
    public String fault_type;

    @TableField("fault_1")
    public String fault_1;

    @TableField("fault_2")
    public String fault_2;

    @TableField("province")
    public String province;

    @TableField("city")
    public String city;

    @TableField("county")
    public String county;

    @TableField("town")
    public String town;

    @TableField("detail")
    public String detail;

    @TableField("fault_time")
    public Date fault_time;
}
