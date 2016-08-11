package abhilash001.chess.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FigureTest extends TestCase{
    public FigureTest(String testName){
        super( testName );
    }

    public static Test suite(){
        return new TestSuite(FigureTest.class);
    }

    public void testFigure(){
        Figure figure = new Figure('A', 1);
		assertEquals("A1", figure.toString());
		assertEquals("A", figure.getX());
		assertEquals("1", figure.getY());
		figure.setX('B');
		figure.setY(2);
		assertEquals("B", figure.getX());
		assertEquals(2, figure.getY());
    }
}
