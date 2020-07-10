package jp.kobespiral.todo.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import jp.kobespiral.todo.entitiy.User;
import lombok.Data;

@Data
public class UserDto {
  
  private Long id;   // key
  @Pattern(regexp = "[0-9a-zA-Z]+")
  private String uid;  //uid
  @NotBlank
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