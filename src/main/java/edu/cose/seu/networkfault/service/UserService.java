package edu.cose.seu.networkfault.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.cose.seu.networkfault.model.User;

public interface UserService extends IService<User> {
    User login(Integer id,String password);
    Boolean ifExistUser(Integer id);
    Integer register(User user);
}
