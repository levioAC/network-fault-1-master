package edu.cose.seu.networkfault.controller;

import com.alibaba.fastjson.JSON;
import edu.cose.seu.networkfault.model.User;
import edu.cose.seu.networkfault.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(value="/login")
    public JSONObject login(@RequestParam("model.User.id")Integer id,
                        @RequestParam("model.User.password")String password){
        //若该用户不存在
        if(!userServiceImpl.ifExistUser(id)){
            return new JSONObject().getJSONObject("password or id is wrong");
        }else {
            User user=userServiceImpl.login(id, password);
            if(user!=null){//若密码正确
                return JSONObject.fromObject(user);
            }else{
                return new JSONObject().getJSONObject("password or id is wrong");
            }
        }
    }

    @RequestMapping(value = "/register")
    public JSONObject register(@RequestParam("model.User.name")Integer id,
                               @RequestParam("model.User.password")String password){
        //若用户已存在
        if(userServiceImpl.ifExistUser(id)){
            return new JSONObject().getJSONObject("id already exists");
        } else{
            userServiceImpl.register(new User(id,password));
            return new JSONObject().getJSONObject("success");
        }
    }
}
