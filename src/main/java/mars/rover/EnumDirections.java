package mars.rover;

public enum EnumDirections{
    N,
    S,
    E,
    W;

    public boolean isNorth(){
        return this.equals(EnumDirections.N);
    }

    public boolean isWest(){
        return this.equals(EnumDirections.W);
    }

    public boolean isEast(){
        return this.equals(EnumDirections.E);
    }

    public boolean isSouth(){
        return this.equals(EnumDirections.S);
    }

    public EnumDirections processNextDirectionWhenRight(){
        EnumDirections nextDirection = null;
        if(this.isNorth()){
            nextDirection = EnumDirections.E;
        } else if(this.isWest()){
            nextDirection = EnumDirections.N;
        } else if(this.isSouth()){
            nextDirection = EnumDirections.W;
        } else if(this.isEast()){
            nextDirection = EnumDirections.S;
        }
        return nextDirection;
    }

    public EnumDirections processNextDirectionWhenLeft(){
        EnumDirections nextDirection = null;

        if(this.isNorth()){
            nextDirection = EnumDirections.W;
        } else if(this.isWest()){
            nextDirection = EnumDirections.S;
        } else if(this.isSouth()){
            nextDirection = EnumDirections.E;
        } else if(this.isEast()){
            nextDirection = EnumDirections.N;
        }
        return nextDirection;
    }
}
