package mars.rover;

public class MarsRover {
    private Point point;
    private Direction direction;

    public MarsRover(int x, int y, char direction) {
        this.point = new Point(x, y);
        this.direction = DirectionFactory.getDirection(direction);
    }

    public void execute(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'L') {
                direction = direction.turnLeft();
            } else if (instruction == 'R') {
                direction = direction.turnRight();
            } else if (instruction == 'M') {
                direction.move(point);
            }
        }
    }

    public String getPosition() {
        return point.getX() + " " + point.getY() + " " + direction.currentDirection();
    }
}