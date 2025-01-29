package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionNoSockaddr {

    private Protocol protocol;

    @Before
    public void setup() {
        // No setup required
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

}