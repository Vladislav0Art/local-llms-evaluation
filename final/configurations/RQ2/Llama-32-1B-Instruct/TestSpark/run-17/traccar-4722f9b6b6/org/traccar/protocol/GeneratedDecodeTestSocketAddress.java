package org.traccar.protocol;

public class GeneratedDecodeTestSocketAddress {

    private Protocol protocol;
    private Channel channel;

    @BeforeClass
    public static void setUp() throws Exception {
        protocol = new Protocol();
        channel = (Channel) Thread.currentThread().getContextClassLoader().loadClass("org.traccar.protocol.WatchProtocol").newInstance();
    }

    @Test
    public void decodeTestSocketAddress() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        byte[] buffer = new byte[10];
        channel.writeBytes(buffer);
        ChannelReadHandler readHandler = (ChannelReadHandler) Thread.currentThread().getContextClassLoader().loadClass("io.netty.channel.ChannelReadHandler").newInstance();
        channel.configureBlocking(false);
        readHandler.onRead(new ChannelReadBuffer(channel, buffer));
        decoder.decode(channel, null, new SocketAddress());
    }

}