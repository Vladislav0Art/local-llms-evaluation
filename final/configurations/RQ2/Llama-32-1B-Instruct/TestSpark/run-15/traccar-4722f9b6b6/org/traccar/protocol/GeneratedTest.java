package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        assertEquals(true, decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        assertEquals("Traccar", decoder.getManufacturer());
    }

    @Test
    public void testDecodeChannelSocketAddressObject() throws Exception {
        Channel channel = new Channel();
        SocketAddress socketAddress = PatternBuilder.toSocketAddress(channel, 12345);
        Object message = decoder.decode(socketAddress, null, null);

        assertNotNull(message);
        assertEquals(12345, (Integer) message);
    }

    @Test
    public void testDecodeChannelSocketAddress() throws Exception {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = new Channel();
        SocketAddress socketAddress = PatternBuilder.toSocketAddress(channel, 12345);
        Object message = decoder.decode(socketAddress, null, null);

        assertNotNull(message);
        assertEquals(12345, (Integer) message);
    }

    @Test
    public void testDecodeChannel() throws Exception {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = new Channel();
        Object message = decoder.decode(channel, null, null);

        assertNotNull(message);
        assertEquals(12345, (Integer) message);
    }

    @Test
    public void testDecodeSocketAddress() throws Exception {
        SocketAddress socketAddress = PatternBuilder.toSocketAddress(new Unpooled(), 12345);
        Object message = decoder.decode(socketAddress, null, null);

        assertNotNull(message);
        assertEquals(12345, (Integer) message);
    }

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