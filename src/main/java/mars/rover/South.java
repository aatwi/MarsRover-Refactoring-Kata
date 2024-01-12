package mars.rover;
public class South implements Direction {
	@Override
	public Direction turnLeft() {
		return new East();
	}

	@Override
	public Direction turnRight() {
		return new West();
	}

	@Override
	public void move(Point point) {
		point.setY(point.getY() - 1);
	}

	@Override
	public char currentDirection() {
		return 'S';
	}
}