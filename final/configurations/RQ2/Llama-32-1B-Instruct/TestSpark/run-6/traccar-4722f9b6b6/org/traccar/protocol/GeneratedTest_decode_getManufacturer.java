package org.traccar.protocol;

public class GeneratedTest_decode_getManufacturer {

    @Test
    public void test_decode_getManufacturer() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anySocketAddress(), anyObject())).thenReturn(msg);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Assert.assertEquals("TracCaster", decoder.getManufacturer());
    }

}