package mars.rover;
public class East implements Direction {
	@Override
	public Direction turnLeft() {
		return new North();
	}

	@Override
	public Direction turnRight() {
		return new South();
	}

	@Override
	public void move(Point point) {
		point.setX(point.getX() + 1);
	}

	@Override
	public char currentDirection() {
		return 'E';
	}
}