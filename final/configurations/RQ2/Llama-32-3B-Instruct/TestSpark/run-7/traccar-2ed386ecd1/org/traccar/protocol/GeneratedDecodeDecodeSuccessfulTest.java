package org.traccar.protocol;

public class GeneratedDecodeDecodeSuccessfulTest {

    @Test
    public void decodeDecodeSuccessfulTest() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = new Gt06ProtocolDecoder(Protocol.GT06).new Object();
        byte[] data = {1, 2, 3};
        ByteBuf buf = Unpooled.buffer(data);
        assert (Gt06ProtocolDecoder.decode(channel, remoteAddress, msg) == null);
    }

}