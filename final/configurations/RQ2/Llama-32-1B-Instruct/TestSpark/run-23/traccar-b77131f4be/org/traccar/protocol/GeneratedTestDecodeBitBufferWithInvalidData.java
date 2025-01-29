package org.traccar.protocol;

public class GeneratedTestDecodeBitBufferWithInvalidData {

    private Protocol protocol;

    @Before
    public void setup() {
        protocol = new Protocol();
    }

    @Test
    public void testDecodeBitBufferWithInvalidData() throws Exception {
        byte[] data = Unpooled.fromByteArray("1234567890abcdef");
        Channel channel = Channel.unixSocket(12345, true);
        SocketAddress remoteAddress = SocketAddress.fromInetPortNumber(12345);

        Object result = protocol.decode(channel, remoteAddress, data);

        assertNull(result);
    }

}