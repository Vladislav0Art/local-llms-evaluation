package org.traccar.protocol;

public class GeneratedTest_decode_decode_init_withMessage_andChannel_socketAddress_socketError {

    @Test
    public void test_decode_decode_init_withMessage_andChannel_socketAddress_socketError() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anyString(), anyObject())).thenThrow(new Exception());
        try {
            BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
            assert false; // should not reach here
        } catch (Exception e) {
            // do nothing
        }
    }

}