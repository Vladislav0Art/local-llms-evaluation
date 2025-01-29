package org.traccar.protocol;

public class GeneratedTestDecodeGpsBufferLengthTrue {

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
    public void testDecodeGpsBufferLengthTrue() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer("1 2 3 4 5", StandardCharsets.UTF_8);
        int length = buf.readInt();

        verifyDecodeGpsPosition(true, length, position, null);
    }

    public void testDecodeGpsBufferLengthFalse() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        byte[] bytes = "/test-data/test-gps-position.txt".getBytes(StandardCharsets.UTF_8);
        ByteBuf buf = Unpooled.buffer(bytes);
        int length = buf.readInt();

        verifyDecodeGpsPosition(false, length, position, null);
    }

    public void testDecodeGpsHasSatellitesTrue() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer("1 2 3", StandardCharsets.UTF_8);
        int length = buf.readInt();

        verifyDecodeGpsPosition(true, length, position, buf);

        buf.release();
    }

    public void testDecodeGpsHasSatellitesFalse() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer("/test-data/test-gps-position.txt", StandardCharsets.UTF_8);
        int length = buf.readInt();

        verifyDecodeGpsPosition(false, length, position, null);
    }

    public void testDecodeGpsHasSpeedTrue() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer("1 2 3", StandardCharsets.UTF_8);
        int length = buf.readInt();

        verifyDecodeGpsPosition(true, length, position, buf);

        buf.release();
    }

    public void testDecodeGpsHasSpeedFalse() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer("/test-data/test-gps-position.txt", StandardCharsets.UTF_8);
        int length = buf.readInt();

        verifyDecodeGpsPosition(false, length, position, null);
    }

    public void testDecodeGpsHasNoLengthTrue() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer("/test-data/test-gps-position.txt", StandardCharsets.UTF_8);
        int length = buf.readInt();

        verifyDecodeGpsPosition(false, length, position, null);
    }

    public void testDecodeGpsHasNoLengthFalse() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        byte[] bytes = "/test-data/test-gps-position.txt".getBytes(StandardCharsets.UTF_8);
        ByteBuf buf = Unpooled.buffer(bytes);
        int length = buf.readInt();

        verifyDecodeGpsPosition(true, length, position, buf);
    }

    public void testDecodeGpsHasNoSatellitesTrue() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer("1 2", StandardCharsets.UTF_8);
        int length = buf.readInt();

        verifyDecodeGpsPosition(false, length, position, buf);

        buf.release();
    }

    public void testDecodeGpsHasNoSatellitesFalse() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        byte[] bytes = "/test-data/test-gps-position.txt".getBytes(StandardCharsets.UTF_8);
        ByteBuf buf = Unpooled.buffer(bytes);
        int length = buf.readInt();

        verifyDecodeGpsPosition(true, length, position, null);
    }

    public void testDecodeGpsHasNoSpeedTrue() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer("1 2", StandardCharsets.UTF_8);
        int length = buf.readInt();

        verifyDecodeGpsPosition(false, length, position, buf);

        buf.release();
    }

    public void testDecodeGpsHasNoSpeedFalse() throws Exception {
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        byte[] bytes = "/test-data/test-gps-position.txt".getBytes(StandardCharsets.UTF_8);
        ByteBuf buf = Unpooled.buffer(bytes);
        int length = buf.readInt();

        verifyDecodeGpsPosition(true, length, position, null);
    }

}