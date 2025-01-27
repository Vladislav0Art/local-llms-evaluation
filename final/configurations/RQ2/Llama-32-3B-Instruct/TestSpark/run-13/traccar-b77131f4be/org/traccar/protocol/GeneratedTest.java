package org.traccar.protocol;

public class GeneratedTest {

    private Channel channel;

    @Mocked
    public void mockChannel() {
        this.channel = new MockedChannel();
    }

    public static class MockedChannel extends Channel {
        @Override
        public ByteBuf alloc() {
            return Unpooled.buffer();
        }
    }

    private SocketAddress remoteAddress;

    @Test
    public void constructor() {
        new GalileoProtocolDecoder(null);
    }

}