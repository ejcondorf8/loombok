package ec.edu.uce.git.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    public String firstName;

    private  String lastName;

    private  int age;
}
