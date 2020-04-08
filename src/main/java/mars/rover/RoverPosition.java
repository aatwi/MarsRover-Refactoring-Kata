package mars.rover;


public class RoverPosition{
    private int x;
    private int y;
    private EnumDirections direction;

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public EnumDirections getDirection(){
        return direction;
    }

    public void setDirection(EnumDirections direction){
        this.direction = direction;
    }

    @Override
    public String toString(){
        return x + " " + y + " " + direction;
    }
}
