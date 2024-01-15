package co.com.castor.admininfoemployees.domain.models;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class Employee {
    private Long id;
    private Long nit;
    private String name;
    private String photo;
    private String dateEntry;
    private Position position;
}
