package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionNull {

    private Gt06ProtocolDecoder decoder;

    @Before
    public void setup() {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    }

    @Test
    public void testDecodeGpsPositionNull() throws Exception {
        // Arrange
        Position position = new Position(0, 0, 0);

        // Act and Assert
        boolean result = decoder.decodeGps(position, null, false, true, true, TimeZone.getDefault());
        assertFalse(result);
    }

}