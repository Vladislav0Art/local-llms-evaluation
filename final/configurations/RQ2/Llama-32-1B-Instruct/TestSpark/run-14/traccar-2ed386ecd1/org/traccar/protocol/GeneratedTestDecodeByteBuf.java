package org.traccar.protocol;

public class GeneratedTestDecodeByteBuf {

    private final Protocol protocol;
    private ByteBuf buf;
    private SocketAddress remoteAddress;
    private Position position;
    private Calendar calendar;

    public static void main(String[] args) {
        Gt06ProtocolDecoderTest test = new Gt06ProtocolDecoderTest();
        test.protocol = new Protocol();
        test.buf = Unpooled.buffer("Hello, World!".getBytes(StandardCharsets.UTF_8));
        test.remoteAddress = SocketAddress - Inet4Address.ofLocalAddress(8080);
        test.position = Position.create(37.7749, -122.4194, 40, 11, 34, 5);
    }

    @Test
    public void testDecodeByteBuf() {
        byte[] bytes = {"1234", "5678"};
        int length = 12;
        boolean hasLength = true;
        boolean hasSatellites = true;
        boolean hasSpeed = false;
        TimeZone timezone = null;

        protocol.decodeGt06ProtocolDecoder(Position.create(37.7749, -122.4194, 40, 11, 34, 5), buf, length, hasLength, hasSatellites, hasSpeed, timezone);
    }

}