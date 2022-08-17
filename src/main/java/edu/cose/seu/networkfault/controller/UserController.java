package edu.cose.seu.networkfault.controller;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import edu.cose.seu.networkfault.model.User;
import edu.cose.seu.networkfault.service.UserService;
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
    public String login(@RequestParam("model.User.id")Integer id,
                        @RequestParam("model.User.password")String password,
                        Model model){
        User user = new User(id,password);
        try {
            if(userServiceImpl.login(user)!=null) {
                return "index";
            }else {
//                model.addAttribute("msg","用户名或密码错误");
                return "login";
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return "login";
    }
}
