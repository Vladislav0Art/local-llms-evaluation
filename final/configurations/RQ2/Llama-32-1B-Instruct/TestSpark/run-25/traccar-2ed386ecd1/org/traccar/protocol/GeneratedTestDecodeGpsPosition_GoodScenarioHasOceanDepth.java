package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition_GoodScenarioHasOceanDepth {

    private Gt06ProtocolDecoder decoder;
    private ByteBuf byteBuf;

    @Before
    public void setup() throws Exception {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        byteBuf = Unpooled.buffer();
    }

    @Test
    public void testDecodeGpsPosition_GoodScenarioHasOceanDepth() throws Exception {
        Position position = new Position(37.774929, -122.419416, 0, 0);
        byteBuf.writeByte(position.getLat());
        byteBuf.writeByte(position.getLon());
        byteBuf.writeByte(position.getTimeStamp());
        byteBuf.writeByte(position.getTimeZoneId().getInteger());

        decoder.decode(channel, remoteAddress, msg -> {
            Position decodedPosition = new Position();
            decodedPosition.setLatitude((byte) byteBuf.read());
            decodedPosition.setLongitude((byte) byteBuf.read());
            return decodedPosition;
        });
        assertTrue(decodedPosition == position);
    }

}