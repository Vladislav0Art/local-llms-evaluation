package org.traccar.protocol;

public class GeneratedDecodeChannelTest {

    @Test
    public void decodeChannelTest() {
        Channel channel = new Channel(1234);
        SocketAddress remoteAddress = new SocketAddress("192.168.1.1", 12345);
        assertTrue(Gt06ProtocolDecoder.decodeGt06(channel, remoteAddress, false, null) == true);

        assertFalse(Gt06ProtocolDecoder.decodeGt06(new Channel(5678), remoteAddress, false, null));
    }

}