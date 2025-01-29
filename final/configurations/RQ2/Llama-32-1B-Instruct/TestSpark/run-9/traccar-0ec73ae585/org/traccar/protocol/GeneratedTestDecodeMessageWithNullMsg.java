package org.traccar.protocol;

public class GeneratedTestDecodeMessageWithNullMsg {

    @Test
    public void testDecodeMessageWithNullMsg() throws Exception {
        MockChannel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        try (MockedByteBuf buffer = Mockito.mock(MockedByteBuf.class)) {
            Mockito.when(channel.readBytes(buffer)).thenReturn(Unpooled.buffer(1024));
            Mockito.when(remoteAddress).thenReturn(remoteAddress);
            Object msg = mock(Object.class);

            Mockito.when(msg).thenReturn("testMessage");

            decoder.decode(channel, remoteAddress, msg);
        }
    }

}