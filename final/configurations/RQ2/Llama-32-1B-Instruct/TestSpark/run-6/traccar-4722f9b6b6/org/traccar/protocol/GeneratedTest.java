package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void test_decode_init() {
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        assert decoder != null;
    }

    @Test
    public void test_decode_getHasIndex() {
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Assert.assertTrue(decoder.getHasIndex());
    }

    @Test
    public void test_decode_getManufacturer() {
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        assert decoder.getManufacturer().equals("TracCaster");
    }

    @Test
    public void test_decode_decode_init_withMessage() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anySocketAddress(), anyObject())).thenReturn(msg);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        assert decoder.decode(channel, null, msg) != null;
    }

    @Test
    public void test_decode_decode_init_withMessage_andChannel() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anySocketAddress(), anyObject())).thenReturn(msg);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        assert decoder.decode(channel, null, msg) != null;
    }

    @Test
    public void test_decode_decode_init_withMessage_andChannel_socketAddress() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anyString(), anyObject())).thenReturn(msg);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        assert decoder.decode(channel, null, msg) != null;
    }

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

    @Test
    public void test_decode_getIndex() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anySocketAddress(), anyObject())).thenReturn(msg);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Assert.assertTrue(decoder.getIndex().equals("TracCaster"));
    }

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

    @Test
    public void test_decode_getIndex_socketAddress() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anyString(), anyObject())).thenReturn(msg);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Assert.assertEquals("TracCaster", decoder.getIndex());
    }

    @Test
    public void test_decode_getIndex_notString() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anySocketAddress(), anyObject())).thenReturn(msg);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Assert.assertFalse(decoder.getIndex().equals("TracCaster"));
    }

    @Test
    public void test_decode_getManufacturer() throws Exception {
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        Mockito.when(channel.write(anySocketAddress(), anyObject())).thenReturn(msg);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Assert.assertEquals("TracCaster", decoder.getManufacturer());
    }

}