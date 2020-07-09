package jp.kobespiral.todo.entitiy;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Pattern(regexp = "[0-9a-zA-Z]+")
    private String uid;
    @NotBlank
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt; //作成日時
  
}