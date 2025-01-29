package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionTrue {

    private Protocol protocol;

    @Before
    public void init() {
        protocol = new Protocol();
    }

    public byte[] decodeGpsPosition(Position position, ByteBuf buf) throws Exception {
        return decode(position, buf, true, null);
    }

    public boolean decodeGpsPosition(Position position, ByteBuf buf, boolean hasLength, TimeZone timezone) throws Exception {
        return protocol.decodeGps(position, buf, hasLength, hasSatellites, hasSpeed, timezone);
    }

    @Test
    public void testDecodeGpsPositionTrue() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        byte[] bytes = Gt06ProtocolDecoderTest.class.getResourceAsStream("/test-data/test-gps-position.txt").readAllBytes();

        ByteBuf buf = Unpooled.buffer(bytes);
        int length = buf.readInt();
        boolean hasLength = true;

        verifyDecodeGpsPosition(true, length, position, buf);

        buf.release();
    }

    public void testDecodeGpsPositionFalse() throws Exception {
        Position position = new Position();

        buf = Unpooled.buffer("/test-data/test-gps-position.txt");
        int length = buf.readInt();

        verifyDecodeGpsPosition(false, length, position, null);
    }

}