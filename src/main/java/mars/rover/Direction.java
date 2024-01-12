package mars.rover;

public interface Direction {
    Direction turnLeft();
    Direction turnRight();
    void move(Point point);
    char currentDirection(); // current direction as character
    
} 
