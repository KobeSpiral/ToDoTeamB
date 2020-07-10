package jp.kobespiral.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.kobespiral.todo.entitiy.Todo;
import jp.kobespiral.todo.form.CreateForm;
import jp.kobespiral.todo.service.TodoService;

@Controller
public class TodoController {
  @Autowired
  TodoService ts;

  @PostMapping("/todos")
  public String registerTodo(@ModelAttribute("CreateForm") @Validated CreateForm createform, Model model) {
      Todo todo = ts.createTodo(createform);
      model.addAttribute("todo", todo); 
      return "register_success";
  }

  
}