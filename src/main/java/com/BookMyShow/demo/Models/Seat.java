
package  com.BookMyShow.demo.Models;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {

    private int number;
    private String seatType;
    private int rowNum;
    private int colNum;
}