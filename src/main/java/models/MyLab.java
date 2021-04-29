package models;

import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class MyLab {

    @OneToMany(mappedBy = "MyLab")
    private List<MyTribble> myTribbles = new ArrayList<>();
}
