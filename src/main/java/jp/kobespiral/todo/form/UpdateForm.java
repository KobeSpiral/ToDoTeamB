package jp.kobespiral.todo.form;

import lombok.Data;

@Data
public class UpdateForm {
  private Long tid;
  private String uid;
  private String title;
  private String description;
  private boolean isOpen;
}