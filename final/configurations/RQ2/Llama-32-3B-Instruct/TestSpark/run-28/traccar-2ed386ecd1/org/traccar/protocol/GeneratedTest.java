package org.traccar.protocol;

public class GeneratedTest {

    private double latitude;
    private double longitude;

    public Position(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "(" + latitude + ", " + longitude + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Position position = (Position) obj;
        return Double.compare(position.latitude, latitude) == 0 && Double.compare(position.longitude, longitude) == 0;
    }
}

public class TestPosition {

    @Test
    public void testConstructPosition() {
        Position position = new Position(37.7749, -122.4194);
        assertEquals("37.7749,-122.4194", position.toString());
    }

    @Test
    public void testEqualsSign() {
        Position position1 = new Position(37.7749, -122.4194);
        Position position2 = new Position(37.7749, -122.4194);
        assertTrue(position1.equals(position2));
    }
}

@Test
public void testCopiedBuffer() throws Exception {
    byte[] buffer = "1".getBytes();
    assertEquals("1", new String(buffer));
}

@Test
public void testCopiedBufferWithStandardCharsets() throws Exception {
    byte[] buffer = "1".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    assertEquals("1", new String(buffer, java.nio.charset.StandardCharsets.UTF_8));
}
	}

@Test
public void testToStringPosition() {
    Position position = new Position(37.7749, -122.4194);
    assertEquals("(37.7749,-122.4194)", position.toString());
}

@Test
public void testEqualsSign2() {
    Position position1 = new Position(37.7749, -122.4194);
    Position position2 = new Position(37.7749, -122.4194);
    assertTrue(position1.equals(position2));
}
		}

public class Main {
    public static void main(String[] args) {
        // Test cases
        TestPosition testPosition = new TestPosition();
        testPosition.testConstructPosition();
        testPosition.testEqualsSign();

        TestUnpooled testUnpooled = new TestUnpooled();
        testUnpooled.testCopiedBuffer();
        testUnpooled.testCopiedBufferWithStandardCharsets();

        PositionTest positionTest = new PositionTest();
        positionTest.testToStringPosition();
        positionTest.testEqualsSign2();
    }

}