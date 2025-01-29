package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition_GoodScenarioHasLength {

    private Gt06ProtocolDecoder decoder;
    private ByteBuf byteBuf;

    @Before
    public void setup() throws Exception {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        byteBuf = Unpooled.buffer();
    }

    @Test
    public void testDecodeGpsPosition_GoodScenarioHasLength() throws Exception {
        Position position = new Position(37.774929, -122.419416, 37.785208, -122.452236);
        byteBuf.writeByte(position.getLatitude());
        byteBuf.writeByte(position.getLongitude());
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