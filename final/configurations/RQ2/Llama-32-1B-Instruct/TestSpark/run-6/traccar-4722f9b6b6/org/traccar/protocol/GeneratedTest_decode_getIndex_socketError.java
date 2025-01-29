package org.traccar.protocol;

public class GeneratedTest_decode_getIndex_socketError {

    @Test
    public void test_decode_getIndex_socketError() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anyString(), anyObject())).thenThrow(new Exception());
        try {
            BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
            Assert.assertFalse(decoder.getIndex().equals("TracCaster"));
        } catch (Exception e) {
            // do nothing
        }
    }

}