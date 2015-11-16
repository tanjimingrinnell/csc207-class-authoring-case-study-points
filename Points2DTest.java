import static org.junit.Assert.*;

import org.junit.Test;

public class Points2DTest {

	@Test
	public void testAdd() {
	  Point2D p1 = new Point2D();
	  p1.add(3, 5);
	  assertEquals("p1.x = 3", 3, p1.x);
	  assertEquals("p1.y = 5", 5, p1.y);
	}

	@Test
	public void testTranslate() {
		Point2D p1 = new Point2D();
		p1.add(3, 5);
		Point2D p2 = new Point2D(3, 6);
		p2.translate(p1);
		assertEquals("p1.x = 3", 3, p1.x);
		assertEquals("p2.x = 6", 6, p2.x);
	}
	
	@Test
	public void testDistance() {
		Point2D p1 = new Point2D(3, 4);
		assertEquals("distance = 5", 5, p1.distance(0, 0));
	}

	@Test
	public void testToString() {
		Point2D p1 = new Point2D(2, 3);
		assertTrue("(2, 3)", p1.toString().equals("(2, 3)"));
	}
	
}
