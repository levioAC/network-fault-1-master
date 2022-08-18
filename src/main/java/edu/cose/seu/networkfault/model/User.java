package edu.cose.seu.networkfault.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@TableName("user")
@Data
public class User {
    @TableId
    @Setter@Getter
    public Integer id;

    @TableField("name")
    @Getter@Setter
    public String name;

    @TableField("password")
    @Setter@Getter
    public String password;

    @TableField("visits")
    @Setter@Getter
    public Integer visits;

    @TableField("lastLogin")
    @Setter@Getter
    public Date lastLogin;

    @TableField("type")
    @Setter@Getter
    public Integer type;

    @TableField("status")
    @Setter@Getter
    public Integer status;

    public User(Integer id,String password){
        this.id=id;
        this.password=password;
    }
}
