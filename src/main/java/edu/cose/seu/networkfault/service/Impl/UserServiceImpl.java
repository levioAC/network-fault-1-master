package edu.cose.seu.networkfault.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.cose.seu.networkfault.mapper.UserMapper;
import edu.cose.seu.networkfault.model.User;
import edu.cose.seu.networkfault.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    UserMapper userMapper;

//    //时间格式化
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

    //登录
    @Override
    public User login(Integer id,String password){
        User user=userMapper.selectById(id);
        //密码正确
        if(password.equals(user.getPassword())){
            user.setVisits(user.getVisits()+1);            //访问次数+1
            user.setLastLogin(toDate(LocalDateTime.now()));//设置上次登录时间
            userMapper.updateById(user);
            return user;
        }else{
            return null;
        }
    }
    //判断用户是否存在
    public Boolean ifExistUser(Integer id){
        return userMapper.selectById(id) != null;
    }
    //进行注册
    public Integer register(User user){
        //设置用户信息并入库
        user.setLastLogin(toDate(LocalDateTime.now()));//设置上次登录时间
        user.setName("name");//设置用户名
        user.setStatus(1);//设置用户状态
        user.setType(1);//设置用户类型
        user.setVisits(1);//设置用户访问次数
        return userMapper.insert(user);//入库
    }

    //将LocalDateTime转为Date
    public static Date toDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

}
