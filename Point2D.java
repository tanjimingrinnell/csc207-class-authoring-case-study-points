
public class Point2D {
	public int x;
	public int y;

	public Point2D(){
		this.x = 0;
		this.y = 0;
	}

	public Point2D(int xValue, int yValue) {
		this.x = xValue;
		this.y = yValue;
	}

	public Point2D add(int dx, int dy){
		this.x += dx;
		this.y += dy;
		return this;
	}

	public void translate(Point2D point) {
		if (point == null) {
			throw new NullPointerException();
		}
		this.x = this.x + point.x;
		this.y = this.y + point.y;
	}

	public int distance(int xValue, int yValue) {
		return (int)Math.sqrt(Math.pow(this.x - xValue, 2) + Math.pow(this.y - yValue, 2));
	}

	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}


	/**
	 * @param args
	 */
	 public static void main(String[] args) {
		// TODO Auto-generated method stub

	 }
}




