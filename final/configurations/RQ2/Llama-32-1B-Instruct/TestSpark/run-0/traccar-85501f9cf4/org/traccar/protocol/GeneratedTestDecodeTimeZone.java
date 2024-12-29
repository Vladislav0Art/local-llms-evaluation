package org.traccar.protocol;

public class GeneratedTestDecodeTimeZone {

    private Gt06ProtocolDecoder decoder;

    @Before
    public void setUp() {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    }

    @Test
    public void testDecodeTimeZone() throws Exception {
        // Arrange
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer(16);
        boolean hasLength = true;
        boolean hasSatellites = true;
        TimeZone timezone = TimeZone.getDefault();

        // Act and Assert
        assertTrue(decoder.decodeGps(position, buf, hasLength, hasSatellites, false, timezone));
    }

}