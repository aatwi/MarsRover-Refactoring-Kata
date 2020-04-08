package mars.rover;

import java.util.List;

public class MarsRover{


    public static String move(RoverPosition roverPosition, List<EnumInstruction> instructions){
        if(hasElements(instructions)){
            EnumInstruction instruction = instructions.get(0);
            if(instruction.isNextInstructionToLeft()){
                roverPosition.setDirection(roverPosition.getDirection().processNextDirectionWhenLeft());
            } else if(instruction.isNextInstructionToRight()){
                roverPosition.setDirection(roverPosition.getDirection().processNextDirectionWhenRight());
            } else if(instruction.isNextInstructionToMoveFoward()){
                if(roverPosition.getDirection().isNorth()){
                    roverPosition.setY(roverPosition.getY() + 1);
                } else if(roverPosition.getDirection().isSouth()){
                    roverPosition.setY(roverPosition.getY() - 1);
                } else if(roverPosition.getDirection().isWest()){
                    roverPosition.setX(roverPosition.getX() - 1);
                } else if(roverPosition.getDirection().isEast()){
                    roverPosition.setX(roverPosition.getX() + 1);
                }
            }
            return move(roverPosition, getUnprocessedInstructions(instructions));
        }
        return roverPosition.toString();
    }

    private static boolean hasElements(List<EnumInstruction> instructions){
        return !instructions.isEmpty();
    }

    private static List<EnumInstruction> getUnprocessedInstructions(List<EnumInstruction> instructions){
        instructions.remove(0);
        return instructions;
    }
}
