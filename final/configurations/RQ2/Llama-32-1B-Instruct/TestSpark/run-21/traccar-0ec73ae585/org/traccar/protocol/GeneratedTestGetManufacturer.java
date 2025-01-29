package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    @Mock
    private Channel channel;
    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void testGetManufacturer() {
        when(channel.readBytes()).thenReturn("hello world");
        when(remoteAddress.getRemoteSocketAddress()).thenReturn(channel);
        when(getManufacturer()).thenReturn("manufacturer");

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        Object result = decoder.decode(channel, remoteAddress);
        assertNotNull(result);
    }

}