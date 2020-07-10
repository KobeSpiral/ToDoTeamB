package jp.kobespiral.todo.entitiy;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
    
  private String title;
  private String description;
  private boolean isOpen;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt; //作成日時  

  @Temporal(TemporalType.TIMESTAMP)
  private Date updatedAt; //更新日時

  @Temporal(TemporalType.TIMESTAMP)
  private Date donedAt; //終了日時
  
  private String uid;
}