package org.traccar.protocol;

public class GeneratedTest_decode_decode_init_withMessage {

    @Test
    public void test_decode_decode_init_withMessage() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anySocketAddress(), anyObject())).thenReturn(msg);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        assert decoder.decode(channel, null, msg) != null;
    }

}