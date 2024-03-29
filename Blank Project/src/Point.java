public class Point {
	double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distanceTo(Point p2) {
		return Math.sqrt((this.x - p2.x) * (this.x - p2.x) + (this.y - p2.y) * (this.y - p2.y));
	}

	public double angleTo(Point p2) {
		try {
			return Math.atan2(this.y - p2.y, this.x - p2.x);
		} catch (Exception e) {

		}
		return 0;
	}

	public boolean inside(Rect r) {

		return (x >= r.pos.x && x <= r.pos.x + r.w && y >= r.pos.y && y <= r.pos.y + r.h);

	}

	public void add(Vec2 v) {
		this.x += v.x;
		this.y += v.y;
	}

	public boolean isSame(Point p) {
		return p.x == this.x && p.y == this.y;
	}
}