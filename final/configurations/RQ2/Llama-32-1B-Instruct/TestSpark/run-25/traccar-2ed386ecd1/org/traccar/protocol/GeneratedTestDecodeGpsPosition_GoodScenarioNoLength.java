package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition_GoodScenarioNoLength {

    private Gt06ProtocolDecoder decoder;
    private ByteBuf byteBuf;

    @Before
    public void setup() throws Exception {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        byteBuf = Unpooled.buffer();
    }

    @Test
    public void testDecodeGpsPosition_GoodScenarioNoLength() throws Exception {
        Position position = new Position(37.774929, -122.419416, 37.785208, -122.452236);
        decoder.decode(channel, remoteAddress, msg -> msg);
        assertTrue(decodedPosition == position);
    }

}