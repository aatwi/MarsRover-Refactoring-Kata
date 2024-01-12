package mars.rover;

public class North implements Direction {
	@Override
	public Direction turnLeft() {
		return new West();
	}

	@Override
	public Direction turnRight() {
		return new East();
	}

	@Override
	public void move(Point point) {
		point.setY(point.getY() + 1);
	}

	@Override
	public char currentDirection() {
		return 'N';
	}
}