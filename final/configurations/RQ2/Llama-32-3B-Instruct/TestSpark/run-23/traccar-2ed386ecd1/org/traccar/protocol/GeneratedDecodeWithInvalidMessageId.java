package org.traccar.protocol;

public class GeneratedDecodeWithInvalidMessageId {

    private static final byte[] buf = Unpooled.buffer(16);
    private static final ByteBuf bufUtil = ByteBufUtil.INSTANCE;
    private static final SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

    @Test
    public void decodeWithInvalidMessageId() {
        Object msg = new Object();
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Exception exception = null;
        try {
            Gt06ProtocolDecoder.decode(channel, remoteAddress, msg);
        } catch (Exception e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
    }

}