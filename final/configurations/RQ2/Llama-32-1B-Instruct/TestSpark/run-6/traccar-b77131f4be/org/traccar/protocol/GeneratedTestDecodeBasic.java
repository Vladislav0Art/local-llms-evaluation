package org.traccar.protocol;

public class GeneratedTestDecodeBasic {

    @Test
    public void testDecodeBasic() {
        Channel channel = MockChannelMocker.create();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 9999);
        Object msg = mock(Object.class, "msg");
        Object result = GalileoProtocolDecoder.decode(channel, remoteAddress, msg);
        assertEquals(GalileoProtocolDecoder.class, result.getClass());
    }

}