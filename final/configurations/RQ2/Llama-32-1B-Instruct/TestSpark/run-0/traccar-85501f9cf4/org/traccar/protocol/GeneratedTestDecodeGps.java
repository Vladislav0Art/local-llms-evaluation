package org.traccar.protocol;

public class GeneratedTestDecodeGps {

    private Gt06ProtocolDecoder decoder;

    @Before
    public void setUp() {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    }

    @Test
    public void testDecodeGps() throws Exception {
        // Arrange
        ByteBuf buf = Unpooled.buffer(16);

        // Act
        boolean result = decoder.decodeGps(Position.class, buf, true, true, false, TimeZone.getDefault());

        // Assert
        assertTrue(result);
    }

}