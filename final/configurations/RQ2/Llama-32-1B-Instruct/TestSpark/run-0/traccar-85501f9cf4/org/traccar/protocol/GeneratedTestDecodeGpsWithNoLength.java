package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithNoLength {

    private Gt06ProtocolDecoder decoder;

    @Before
    public void setUp() {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    }

    @Test
    public void testDecodeGpsWithNoLength() throws Exception {
        // Arrange
        ByteBuf buf = Unpooled.buffer(16);

        // Act and Assert
        assertFalse(decoder.decodeGps(Position.class, buf, false, true, false, TimeZone.getDefault()));
    }

}