package jp.kobespiral.todo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.kobespiral.todo.dto.TodoDto;
import jp.kobespiral.todo.entitiy.Todo;
import jp.kobespiral.todo.form.CreateForm;
import jp.kobespiral.todo.repository.TodoRepository;

@Service
public class TodoService {
  @Autowired
  TodoRepository tr;

  public Todo createTodo(CreateForm form){
    Date now = new Date();
    Todo todo = tr.save(new Todo(null, form.getTitle(), form.getDescription(), true, now, now, null, form.getUid()));
    return todo;
    // List<UserDto> uids = this.getUserByuid(uid);
    
  //   if (uid != null && uids.isEmpty()){
  //     User user = userRepository.save(new User(null, form.getUid(), form.getName(), now));
  //     return UserDto.build(user);
  // } else { 
  //     throw new UidException("ユーザIDが重複しています");
  // }
}

}