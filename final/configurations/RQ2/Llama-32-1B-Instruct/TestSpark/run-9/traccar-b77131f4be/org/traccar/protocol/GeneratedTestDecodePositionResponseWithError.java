package org.traccar.protocol;

public class GeneratedTestDecodePositionResponseWithError {

    private Protocol protocol;

    @Before
    public void setup() {
        protocol = new Protocol();
    }

    @Test
    public void testDecodePositionResponseWithError() throws Exception {
        byte[] bytes = Util.encodeToString(new Position(3, 4), StandardCharsets.UTF_8);
        Channel channel = new Unpooled().byteBuf();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 12345);
        Object msg = protocol.decode(channel, remoteAddress, bytes);

        assertEquals(Position.class, msg.getClass());
    }

}