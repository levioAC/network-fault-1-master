package edu.cose.seu.networkfault.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("risk")
@Data
public class Risk {

    @TableId
    public Integer risk_id;

    @TableField("level")
    public String level;

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


}
