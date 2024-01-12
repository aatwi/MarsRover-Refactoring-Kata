package mars.rover;
public class West implements Direction {
	@Override
	public Direction turnLeft() {
		return new South();
	}

	@Override
	public Direction turnRight() {
		return new North();
	}

	@Override
	public void move(Point point) {
		point.setX(point.getX() - 1);
	}

	@Override
	public char currentDirection() {
		return 'W';
	}
}