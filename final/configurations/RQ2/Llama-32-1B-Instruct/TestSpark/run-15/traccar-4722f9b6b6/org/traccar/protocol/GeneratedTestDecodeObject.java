package org.traccar.protocol;

public class GeneratedTestDecodeObject {

    @Test
    public void testDecodeObject() throws Exception {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Object message = decoder.decode(new Object(), null, null);

        assertNotNull(message);
        assertTrue(message instanceof Protocol);
    }
}

class PatternBuilder {

    private static final Pattern pattern = Pattern.compile("[0-9]+");

    public static SocketAddress toSocketAddress(Channel channel, int port) {
        byte[] bytes = new byte[4];
        channel.readBytes(bytes);
        return new SocketAddress(Unpooled.wrap(new NetworkMessage(), bytes), port);
    }

}