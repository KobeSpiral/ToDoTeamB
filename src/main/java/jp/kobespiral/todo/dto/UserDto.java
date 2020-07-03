package jp.kobespiral.todo.dto;

import java.util.Date;

import jp.kobespiral.todo.entitiy.User;
import lombok.Data;

@Data
public class UserDto {
  
  private Long id;   // key
  private String uid;  //uid
  private String name; //name
  private Date createdAt; //作成日時

  public static UserDto build(User user) {
    UserDto dto = new UserDto();
    dto.id = user.getId();
    dto.uid = user.getUid();
    dto.name = user.getName();
    dto.createdAt = user.getCreatedAt();
    return dto;
  }

}