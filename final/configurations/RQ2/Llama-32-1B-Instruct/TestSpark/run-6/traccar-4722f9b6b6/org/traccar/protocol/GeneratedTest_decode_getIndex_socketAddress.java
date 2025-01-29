package org.traccar.protocol;

public class GeneratedTest_decode_getIndex_socketAddress {

    @Test
    public void test_decode_getIndex_socketAddress() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anyString(), anyObject())).thenReturn(msg);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Assert.assertEquals("TracCaster", decoder.getIndex());
    }

}