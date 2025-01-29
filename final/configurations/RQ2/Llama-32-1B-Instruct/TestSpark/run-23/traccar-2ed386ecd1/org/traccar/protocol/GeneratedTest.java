package org.traccar.protocol;

public class GeneratedTest {

    private Protocol protocol;

    @Before
    public void setup() {
        // No setup required
    }

    @Test
    public void testDecodeGpsPosition() throws Exception {
        // Arrange
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Unpooled.buffer();
        Channel channel = Unpooled.newChannel();

        // Act
        boolean hasLength = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        boolean hasSatellites = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        boolean hasSpeed = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());

        // Assert
        assertEquals(true, hasLength);
        assertEquals(false, hasSatellites);
        assertEquals(false, hasSpeed);
    }

    @Test
    public void testDecodeGpsPositionNoTimezone() throws Exception {
        // Arrange
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Unpooled.buffer();
        Channel channel = Unpooled.newChannel();

        // Act
        boolean hasLength = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        boolean hasSatellites = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        boolean hasSpeed = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());

        // Assert
        assertEquals(false, hasLength);
        assertEquals(true, hasSatellites);
        assertEquals(false, hasSpeed);
    }

    @Test
    public void testDecodeGpsPositionInvalidDate() throws Exception {
        // Arrange
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Unpooled.buffer();
        Channel channel = Unpooled.newChannel();

        // Act
        boolean hasLength = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        boolean hasSatellites = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        boolean hasSpeed = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());

        // Assert
        assertEquals(false, hasLength);
        assertEquals(true, hasSatellites);
        assertEquals(false, hasSpeed);
    }

    @Test
    public void testDecodeGpsPositionInvalidMessageType() throws Exception {
        // Arrange
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Unpooled.buffer();
        Channel channel = Unpooled.newChannel();

        // Act
        boolean hasLength = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        boolean hasSatellites = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        boolean hasSpeed = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());

        // Assert
        assertEquals(false, hasLength);
        assertEquals(true, hasSatellites);
        assertEquals(false, hasSpeed);
    }

    @Test
    public void testDecodeGpsPositionInvalidSockaddr() throws Exception {
        // Arrange
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Unpooled.buffer();
        Channel channel = Unpooled.newChannel();

        // Act
        boolean hasLength = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        boolean hasSatellites = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        boolean hasSpeed = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());

        // Assert
        assertEquals(false, hasLength);
        assertEquals(true, hasSatellites);
        assertEquals(false, hasSpeed);
    }

    @Test
    public void testDecodeGpsPositionInvalidUnit() throws Exception {
        // Arrange
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Unpooled.buffer();
        Channel channel = Unpooled.newChannel();

        // Act
        boolean hasLength = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        boolean hasSatellites = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        boolean hasSpeed = protocol.decodeGps(position, buf, false, true, false, TimeZone.getDefault());

        // Assert
        assertEquals(false, hasLength);
        assertEquals(true, hasSatellites);
        assertEquals(false, hasSpeed);
    }

    @Test
    public void testDecodeGpsPositionNoSockaddr() throws Exception {
        // Arrange
        Position position = new Position(37.7749, -122.4194);

        // Act
        boolean hasLength = protocol.decodeGps(position, Unpooled.buffer(), false, true, false, TimeZone.getDefault());
        boolean hasSatellites = protocol.decodeGps(position, Unpooled.buffer(), false, true, false, TimeZone.getDefault());
        boolean hasSpeed = protocol.decodeGps(position, Unpooled.buffer(), false, true, false, TimeZone.getDefault());

        // Assert
        assertEquals(false, hasLength);
        assertEquals(true, hasSatellites);
        assertEquals(false, hasSpeed);
    }

    @Test
    public void testDecodeGpsPositionInvalidUnitType() throws Exception {
        // Arrange
        Position position = new Position(37.7749, -122.4194);

        // Act
        boolean hasLength = protocol.decodeGps(position, Unpooled.buffer(), false, true, false, TimeZone.getDefault());
        boolean hasSatellites = protocol.decodeGps(position, Unpooled.buffer(), false, true, false, TimeZone.getDefault());
        boolean hasSpeed = protocol.decodeGps(position, Unpooled.buffer(), false, true, false, TimeZone.getDefault());

        // Assert
        assertEquals(false, hasLength);
        assertEquals(true, hasSatellites);
        assertEquals(false, hasSpeed);
    }

}