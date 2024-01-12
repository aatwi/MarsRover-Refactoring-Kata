package mars.rover;
public class DirectionFactory {
    public static Direction getDirection(char direction) {
        switch (direction) {
            case 'N':
                return new North();
            case 'S':
                return new South();
            case 'E':
                return new East();
            case 'W':
                return new West();
            default:
                throw new IllegalArgumentException("Invalid direction: " + direction);
        }
    }
}