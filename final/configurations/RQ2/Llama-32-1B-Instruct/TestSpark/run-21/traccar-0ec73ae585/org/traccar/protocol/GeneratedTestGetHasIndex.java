package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    @Mock
    private Channel channel;
    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void testGetHasIndex() {
        when(channel.readBytes()).thenReturn("hello world");
        when(remoteAddress.getRemoteSocketAddress()).thenReturn(channel);
        when(getHasIndex()).thenReturn(true);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        Object result = decoder.decode(channel, remoteAddress);
        assertNotNull(result);
    }

}