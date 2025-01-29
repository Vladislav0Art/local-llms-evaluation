package org.traccar.protocol;

public class GeneratedTestDecodeBitBufferWithNullChannel {

    private Protocol protocol;

    @Before
    public void setup() {
        protocol = new Protocol();
    }

    @Test
    public void testDecodeBitBufferWithNullChannel() throws Exception {
        byte[] data = Unpooled.fromByteArray("1234567890abcdef");
        SocketAddress remoteAddress = null;
        DeviceSession deviceSession = new DeviceSession();

        Object result = protocol.decode(remoteAddress, remoteAddress, data);

        assertNull(result);
    }

}