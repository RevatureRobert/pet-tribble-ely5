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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="OWNER_ID")
    private MyLab myLab;

    @Id
    @GeneratedValue
    int id;
    String name;
    int age;
}
