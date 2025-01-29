package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionInvalidDate {

    private Protocol protocol;

    @Before
    public void setup() {
        // No setup required
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

}