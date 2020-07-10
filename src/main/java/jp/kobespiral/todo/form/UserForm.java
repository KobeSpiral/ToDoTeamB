package jp.kobespiral.todo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class UserForm {
  @Pattern(regexp = "[0-9a-zA-Z]+")
  private String uid;
  
  @NotBlank
  private String name;
}
