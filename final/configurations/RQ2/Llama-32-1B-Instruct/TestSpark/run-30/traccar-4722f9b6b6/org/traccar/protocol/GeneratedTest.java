package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertEquals("TRACCA", decoder.getManufacturer());
    }

    @Test
    public void testDecode_WatchProtocol() throws Exception {
        String message = "{\"watch\":{\"location\":{\"lat\":10.0,\"lon\":101.0,\"height\":100,\"altitude\":20,\"timestamp\":\"2023-02-20T14:30:00.000Z\"}}";
        ByteBuf buffer = Unpooled.buffer(message.getBytes(StandardCharsets.UTF_8));
        Channel channel = new Channel(Unpooled.buffer().toSocketChannel());
        SocketAddress remoteAddress = new SocketAddress("localhost", 8080);
        Object msg = decoder.decode(channel, remoteAddress, buffer);
        assertNotNull(msg);
        assertTrue((Position) msg instanceof Position);
    }

    @Test
    public void testDecode_WatchProtocol_NoData() throws Exception {
        String message = "{\"watch\":{}}";
        ByteBuf buffer = Unpooled.buffer(message.getBytes(StandardCharsets.UTF_8));
        Channel channel = new Channel(Unpooled.buffer().toSocketChannel());
        SocketAddress remoteAddress = new SocketAddress("localhost", 8080);
        Object msg = decoder.decode(channel, remoteAddress, buffer);
        assertNull(msg);
    }

    @Test
    public void testDecode_WatchProtocol_InvalidData() throws Exception {
        String message = "{\"watch\":{\"location\":{\"lat\":10.0,\"lon\":101.0,\"height\":100,\"altitude\":20,\"timestamp\":\"2023-02-20T14:30:00.000Z\"}}";
        ByteBuf buffer = Unpooled.buffer(message.getBytes(StandardCharsets.UTF_8));
        Channel channel = new Channel(Unpooled.buffer().toSocketChannel());
        SocketAddress remoteAddress = new SocketAddress("localhost", 8080);
        Object msg = decoder.decode(channel, remoteAddress, buffer);
        assertFalse((Position) msg instanceof Position);
    }

    @Test
    public void testDecode_WatchProtocol_NullMessage() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertNull(decoder.decode(null, null, null));
    }

}