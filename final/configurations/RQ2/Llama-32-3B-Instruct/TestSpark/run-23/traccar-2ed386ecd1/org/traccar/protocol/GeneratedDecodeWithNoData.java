package org.traccar.protocol;

public class GeneratedDecodeWithNoData {

    private static final byte[] buf = Unpooled.buffer(16);
    private static final ByteBuf bufUtil = ByteBufUtil.INSTANCE;
    private static final SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

    @Test
    public void decodeWithNoData() {
        Object msg = new Object();
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object result = Gt06ProtocolDecoder.decode(channel, remoteAddress, msg);
        Assert.assertNull(result);
    }

}