import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    private Square getSquare(double width) {
        return new Square(width);
    }

    @Test
    public void computeArea0() {
        Square square = getSquare(0.0);
        assertEquals(0.0, square.computeArea(), 0.0);
    }

    @Test
    public void computeArea1() {
        Square square = getSquare(1.0);
        assertEquals(1.0, square.computeArea(), 0.0);
    }

    @Test
    public void computeArea2() {
        Square square = getSquare(2.0);
        assertEquals(4.0, square.computeArea(), 0.0);
    }

    @Test
    public void computeArea3() {
        Square square = getSquare(3.0);
        assertEquals(9.0, square.computeArea(), 0.0);
    }
}
