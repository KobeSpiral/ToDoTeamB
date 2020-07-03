package jp.kobespiral.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jp.kobespiral.todo.dto.UserDto;
import jp.kobespiral.todo.form.UserForm;
import jp.kobespiral.todo.service.UserService;

@Controller
public class UserController {
  @Autowired
  private UserService us;

  @PostMapping("/users")
  public String addUser(@ModelAttribute("userForm") UserForm userform, Model model) {
      UserDto userdto = us.createUser(userform);
      model.addAttribute("uid", userdto.getUid());
      model.addAttribute("name", userdto.getName());
      model.addAttribute("createdAt", userdto.getCreatedAt());

      return "success";
  }

  
  @GetMapping("/users/{uid}")
  public String showUser(@PathVariable String uid, Model model){
      List<UserDto> userList = us.getUserByuid(uid);
      model.addAttribute("ulist", userList);
      return "ulist";
  }

  @GetMapping("/users")
  public String showAllUser(Model model){
      List<UserDto> userList = us.getAllUsers();
      model.addAttribute("allulist", userList);
      return "alluserlist";
  }


}