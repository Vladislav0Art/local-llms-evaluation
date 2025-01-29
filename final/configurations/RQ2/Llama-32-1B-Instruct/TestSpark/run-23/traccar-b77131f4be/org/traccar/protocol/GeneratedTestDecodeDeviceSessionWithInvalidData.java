package org.traccar.protocol;

public class GeneratedTestDecodeDeviceSessionWithInvalidData {

    private Protocol protocol;

    @Before
    public void setup() {
        protocol = new Protocol();
    }

    @Test
    public void testDecodeDeviceSessionWithInvalidData() throws Exception {
        byte[] data = Unpooled.fromByteArray("1234567890abcdef");
        Channel channel = Channel.unixSocket(12345, true);
        SocketAddress remoteAddress = SocketAddress.fromInetPortNumber(12345);

        Object result = protocol.decode(channel, remoteAddress, data);

        assertNull(result);
    }

}