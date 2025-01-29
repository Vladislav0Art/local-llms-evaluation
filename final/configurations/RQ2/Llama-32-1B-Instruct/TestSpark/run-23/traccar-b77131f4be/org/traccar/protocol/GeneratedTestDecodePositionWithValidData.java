package org.traccar.protocol;

public class GeneratedTestDecodePositionWithValidData {

    private Protocol protocol;

    @Before
    public void setup() {
        protocol = new Protocol();
    }

    @Test
    public void testDecodePositionWithValidData() throws Exception {
        byte[] data = Unpooled.fromByteArray("1234567890abcdef");
        Channel channel = Channel.unixSocket(12345, true);
        SocketAddress remoteAddress = SocketAddress.fromInetPortNumber(12345);

        Position position = new Position();
        BitBuffer bitBuffer = BitUtil.buildBitVector(1);
        bitBuffer.flip();

        Object result = protocol.decode(channel, remoteAddress, data);

        assertNotNull(result);
        assertEquals(position, (Position) result);
    }

}