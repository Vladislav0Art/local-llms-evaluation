package org.traccar.protocol;

public class GeneratedTestDecodeBitBufferWithEmptyInput {

    private Protocol protocol;

    @Before
    public void setup() {
        protocol = new Protocol();
    }

    @Test
    public void testDecodeBitBufferWithEmptyInput() throws Exception {
        byte[] data = new byte[0];
        Channel channel = Channel.unixSocket(12345, true);
        SocketAddress remoteAddress = SocketAddress.fromInetPortNumber(12345);

        Object result = protocol.decode(channel, remoteAddress, data);

        assertNull(result);
    }

}