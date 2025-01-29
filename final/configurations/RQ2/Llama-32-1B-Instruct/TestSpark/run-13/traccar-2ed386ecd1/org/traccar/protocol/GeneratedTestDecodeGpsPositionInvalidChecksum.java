package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionInvalidChecksum {

    private Gt06ProtocolDecoder decoder;

    @Before
    public void setup() {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    }

    @Test
    public void testDecodeGpsPositionInvalidChecksum() throws Exception {
        // Arrange
        Position position = new Position(0, 0, 0);

        // Act and Assert
        boolean result = decoder.decodeGps(position, Unpooled.buffer(), false, true, false, TimeZone.getDefault());
        assertFalse(result);
    }

}