package jp.kobespiral.todo.form;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
public class TodoForm {
  
  private Long tid;
  private String name;
  private String title;
  private String description;
  private boolean isOpen;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt; //作成日時  

  @Temporal(TemporalType.TIMESTAMP)
  private Date updatedAt; //更新日時

  @Temporal(TemporalType.TIMESTAMP)
  private Date donedAt; //終了日時
  
}