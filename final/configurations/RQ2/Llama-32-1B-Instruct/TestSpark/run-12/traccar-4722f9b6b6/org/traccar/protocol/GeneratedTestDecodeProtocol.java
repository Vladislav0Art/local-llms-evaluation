package org.traccar.protocol;

public class GeneratedTestDecodeProtocol {

    @Test
    public void testDecodeProtocol() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals(Protocol.class, decoder.getProtocol());
    }

    private Channel MockChannel() {
        return MockChannel.createSocketChannel();
    }

    private SocketAddress MockSocketAddress() {
        return MockSocketAddress.create();
    }

    private String encodeString(String value) {
        return Unpooled.buffered().write(value.getBytes(StandardCharsets.UTF_8)).toString();
    }

}