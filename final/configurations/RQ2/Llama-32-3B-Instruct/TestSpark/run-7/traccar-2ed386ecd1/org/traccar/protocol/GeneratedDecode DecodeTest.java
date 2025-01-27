package org.traccar.protocol;

public class GeneratedDecode DecodeTest {

    @Test
    public void decode

    DecodeTest() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = new Gt06ProtocolDecoder(Protocol.GT06).new Object();
        assert (Gt06ProtocolDecoder.decode(channel, remoteAddress, msg) == null);
    }

}