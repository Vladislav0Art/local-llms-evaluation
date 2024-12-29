package org.traccar.protocol;

public class GeneratedTestDecodeSatellites {

    private Gt06ProtocolDecoder decoder;

    @Before
    public void setUp() {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    }

    @Test
    public void testDecodeSatellites() throws Exception {
        // Arrange
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer(16);
        boolean hasLength = true;

        // Act and Assert
        assertTrue(decoder.decodeGps(position, buf, hasLength, false, false, TimeZone.getDefault()));
    }

}