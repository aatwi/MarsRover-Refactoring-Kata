package mars.rover;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    private List<EnumInstruction> instructions = new ArrayList<>();
    private RoverPosition roverPosition = new RoverPosition();

    @Test
    public void
    acceptance_test_1() {
        instructions.add(EnumInstruction.L);
        instructions.add(EnumInstruction.M);
        instructions.add(EnumInstruction.L);
        instructions.add(EnumInstruction.M);
        instructions.add(EnumInstruction.L);
        instructions.add(EnumInstruction.M);
        instructions.add(EnumInstruction.L);
        instructions.add(EnumInstruction.M);
        instructions.add(EnumInstruction.M);

        roverPosition.setX(1);
        roverPosition.setY(2);
        roverPosition.setDirection(EnumDirections.N);

        String newPosition = MarsRover.move(roverPosition, instructions);
        assertEquals("1 3 N", newPosition);
    }

    @Test
    public void
    acceptance_test_2() {
        instructions.add(EnumInstruction.M);
        instructions.add(EnumInstruction.M);
        instructions.add(EnumInstruction.R);
        instructions.add(EnumInstruction.M);
        instructions.add(EnumInstruction.M);
        instructions.add(EnumInstruction.R);
        instructions.add(EnumInstruction.M);
        instructions.add(EnumInstruction.R);
        instructions.add(EnumInstruction.R);
        instructions.add(EnumInstruction.M);

        roverPosition.setX(3);
        roverPosition.setY(3);
        roverPosition.setDirection(EnumDirections.E);

        String newPosition = MarsRover.move(roverPosition, instructions);
        assertEquals("5 1 E", newPosition);
    }

}