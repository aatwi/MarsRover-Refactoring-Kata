
package mars.rover;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void testExecuteAndGetPosition() {
        MarsRover rover = new MarsRover(0, 0, 'N');
        rover.execute("M");
        assertEquals("0 1 N", rover.getPosition());

        rover = new MarsRover(0, 0, 'N');
        rover.execute("MMRMM");
        assertEquals("2 2 E", rover.getPosition());

        rover = new MarsRover(2, 2, 'E');
        rover.execute("MMRMM");
        assertEquals("4 0 S", rover.getPosition());
    }
}