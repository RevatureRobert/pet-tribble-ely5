package models;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class MyTribble {

    @Id
    @GeneratedValue
    int id;
    String name;
    int age;
}
