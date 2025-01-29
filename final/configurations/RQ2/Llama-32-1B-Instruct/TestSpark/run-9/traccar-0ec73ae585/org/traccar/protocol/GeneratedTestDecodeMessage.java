package org.traccar.protocol;

public class GeneratedTestDecodeMessage {

    @Test
    public void testDecodeMessage() throws Exception {
        MockChannel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        try (MockedByteBuf buffer = Mockito.mock(MockedByteBuf.class)) {
            Mockito.when(channel.readBytes(buffer)).thenReturn(Unpooled.buffer(1024));
            Mockito.when(remoteAddress).thenReturn(remoteAddress);
            Mockito.when(msg).thenReturn("testMessage");

            Object result = decoder.decode(channel, remoteAddress, msg);

            Mockito.verifyNoMoreInteractions(channel, Mockito.times(1));
        }
    }

}