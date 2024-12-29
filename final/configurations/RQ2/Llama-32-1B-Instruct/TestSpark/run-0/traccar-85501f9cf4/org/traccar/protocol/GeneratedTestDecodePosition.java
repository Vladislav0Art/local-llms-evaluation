package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    private Gt06ProtocolDecoder decoder;

    @Before
    public void setUp() {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    }

    @Test
    public void testDecodePosition() throws Exception {
        // Arrange
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer(16);

        // Act and Assert
        assertTrue(decoder.decodeGps(position, buf, false, true, false, TimeZone.getDefault()));
    }

}