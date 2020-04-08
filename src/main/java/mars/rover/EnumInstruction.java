package mars.rover;

public enum EnumInstruction{
    L,
    M,
    R;

    public boolean isNextInstructionToMoveFoward(){
        return this.equals(EnumInstruction.M);
    }

    public boolean isNextInstructionToRight(){
        return this.equals(EnumInstruction.R);
    }

    public boolean isNextInstructionToLeft(){
        return this.equals(EnumInstruction.L);
    }

}
