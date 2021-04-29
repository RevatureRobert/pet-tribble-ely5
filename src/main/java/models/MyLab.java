package models;

import com.sun.javafx.scene.control.skin.VirtualFlow;
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
    private List<MyTribble> myTribbles = new ArrayList<>();
}
