package org.traccar.protocol;

public class GeneratedTestDecodeDeviceSessionResponseWithError {

    private Protocol protocol;

    @Before
    public void setup() {
        protocol = new Protocol();
    }

    @Test
    public void testDecodeDeviceSessionResponseWithError() throws Exception {
        byte[] bytes = Util.encodeToString(new DeviceSession(6), StandardCharsets.UTF_8);
        Channel channel = new Unpooled().byteBuf();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 12345);
        Object msg = protocol.decode(channel, remoteAddress, bytes);

        assertEquals(DeviceSession.class, msg.getClass());
    }

}