package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionInvalidLength {

    private Gt06ProtocolDecoder decoder;

    @Before
    public void setup() {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    }

    @Test
    public void testDecodeGpsPositionInvalidLength() throws Exception {
        // Arrange
        ByteBuf buf = Unpooled.buffer();
        Position position = new Position(0, 0, 0);

        // Act and Assert
        boolean result = decoder.decodeGps(position, buf, false, true, false, TimeZone.getDefault());
        assertFalse(result);
    }

}