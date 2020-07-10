package jp.kobespiral.todo.form;

import lombok.Data;

@Data
public class CreateForm {
  private String uid;
  private String title;
  private String description;
}