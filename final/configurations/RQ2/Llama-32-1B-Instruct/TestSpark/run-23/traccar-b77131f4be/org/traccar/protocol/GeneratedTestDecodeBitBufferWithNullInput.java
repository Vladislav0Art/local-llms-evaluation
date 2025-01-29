package org.traccar.protocol;

public class GeneratedTestDecodeBitBufferWithNullInput {

    private Protocol protocol;

    @Before
    public void setup() {
        protocol = new Protocol();
    }

    @Test
    public void testDecodeBitBufferWithNullInput() throws Exception {
        byte[] data = null;
        Channel channel = Channel.unixSocket(12345, true);
        SocketAddress remoteAddress = SocketAddress.fromInetPortNumber(12345);

        Object result = protocol.decode(channel, remoteAddress, data);

        assertNull(result);
    }

}