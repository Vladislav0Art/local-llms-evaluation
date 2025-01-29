package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionNoTimezone {

    private Gt06ProtocolDecoder decoder;

    @Before
    public void setup() {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    }

    @Test
    public void testDecodeGpsPositionNoTimezone() throws Exception {
        // Arrange
        ByteBuf buf = Unpooled.buffer();
        Position position = new Position(0, 0, 0);

        // Act and Assert
        boolean result = decoder.decodeGps(position, buf, false, true, true, null);
        assertFalse(result);
    }

}