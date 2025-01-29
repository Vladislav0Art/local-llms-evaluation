package org.traccar.protocol;

public class GeneratedTest_decode_getIndex_notString {

    @Test
    public void test_decode_getIndex_notString() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anySocketAddress(), anyObject())).thenReturn(msg);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Assert.assertFalse(decoder.getIndex().equals("TracCaster"));
    }

}