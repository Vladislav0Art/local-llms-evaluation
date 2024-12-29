package org.traccar.protocol;

public class GeneratedTestDecodePositionWithNoLength {

    private Gt06ProtocolDecoder decoder;

    @Before
    public void setUp() {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    }

    @Test
    public void testDecodePositionWithNoLength() throws Exception {
        // Arrange
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer(16);

        // Act and Assert
        assertFalse(decoder.decodeGps(position, buf, true, false, false, TimeZone.getDefault()));
    }

}