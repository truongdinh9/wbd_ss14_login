package Controller;

import dao.UserDao;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

@GetMapping
   public String showLoginForm(){

    return "index";
}
@PostMapping
   public String showloginResult(@RequestParam String account,@RequestParam String password, Model model) {
   User user= UserDao.checkUser(account,password);
   if(user==null) {return "error";}
   else{
       model.addAttribute("user",user);
       return "success";
   }
//    model.addAttribute("user",user);
//    return "result";
}
}
