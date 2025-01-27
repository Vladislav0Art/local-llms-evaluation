package org.traccar.protocol;

public class GeneratedDecodeWithEmptyMessageId {

    private static final byte[] buf = Unpooled.buffer(16);
    private static final ByteBuf bufUtil = ByteBufUtil.INSTANCE;
    private static final SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

    @Test
    public void decodeWithEmptyMessageId() {
        Object msg = new Object();
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object result = Gt06ProtocolDecoder.decode(channel, remoteAddress, msg);
        Assert.assertEquals(0, ((Integer) result).intValue());
    }

}