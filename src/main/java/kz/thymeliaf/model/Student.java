package kz.thymeliaf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Student {

  private int id;
  private String name;
  private String surname;
  private int exam;
  private String mark;

}
