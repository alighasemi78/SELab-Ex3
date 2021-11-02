import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    private Rectangle getRectangle(double width, double height) {
        return new Rectangle(width, height);
    }

    @Test
    public void computeArea0x1() {
        Rectangle rectangle = getRectangle(0.0, 1.0);
        assertEquals(0.0, rectangle.computeArea(), 0.0);
    }

    @Test
    public void computeArea0x2() {
        Rectangle rectangle = getRectangle(0.0, 2.0);
        assertEquals(0.0, rectangle.computeArea(), 0.0);
    }

    @Test
    public void computeArea0x3() {
        Rectangle rectangle = getRectangle(0.0, 3.0);
        assertEquals(0.0, rectangle.computeArea(), 0.0);
    }

    @Test
    public void computeArea1x0() {
        Rectangle rectangle = getRectangle(1.0, 0.0);
        assertEquals(0.0, rectangle.computeArea(), 0.0);
    }

    @Test
    public void computeArea1x2() {
        Rectangle rectangle = getRectangle(1.0, 2.0);
        assertEquals(2.0, rectangle.computeArea(), 0.0);
    }

    @Test
    public void computeArea1x3() {
        Rectangle rectangle = getRectangle(1.0, 3.0);
        assertEquals(3.0, rectangle.computeArea(), 0.0);
    }

    @Test
    public void computeArea2x0() {
        Rectangle rectangle = getRectangle(2.0, 0.0);
        assertEquals(0.0, rectangle.computeArea(), 0.0);
    }

    @Test
    public void computeArea2x1() {
        Rectangle rectangle = getRectangle(2.0, 1.0);
        assertEquals(2.0, rectangle.computeArea(), 0.0);
    }

    @Test
    public void computeArea2x3() {
        Rectangle rectangle = getRectangle(2.0, 3.0);
        assertEquals(6.0, rectangle.computeArea(), 0.0);
    }

    @Test
    public void computeArea3x0() {
        Rectangle rectangle = getRectangle(3.0, 0.0);
        assertEquals(0.0, rectangle.computeArea(), 0.0);
    }

    @Test
    public void computeArea3x1() {
        Rectangle rectangle = getRectangle(3.0, 1.0);
        assertEquals(3.0, rectangle.computeArea(), 0.0);
    }

    @Test
    public void computeArea3x2() {
        Rectangle rectangle = getRectangle(3.0, 2.0);
        assertEquals(6.0, rectangle.computeArea(), 0.0);
    }
}
