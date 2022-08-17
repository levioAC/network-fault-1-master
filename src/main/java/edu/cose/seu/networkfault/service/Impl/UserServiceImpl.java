package edu.cose.seu.networkfault.service.Impl;

import edu.cose.seu.networkfault.mapper.UserMapper;
import edu.cose.seu.networkfault.model.User;
import edu.cose.seu.networkfault.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public String login(User user){
        try {
            User userExistN = userMapper.selectById(user.getId());
            if (userExistN != null) {
                String password = userMapper.selectById(user.getId()).getPassword();
                if (/*md5(password)*/password.equals(user.getPassword())) {
                    return user.getName()+"登录成功，欢迎您！";
                }else{
                    return "登录失败，密码错误！";
                }
            }else {
                return "登录失败，用户不存在!";
            }
        }catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    };
}
