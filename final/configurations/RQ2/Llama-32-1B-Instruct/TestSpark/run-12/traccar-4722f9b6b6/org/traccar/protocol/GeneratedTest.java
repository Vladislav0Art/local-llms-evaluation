package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertEquals(true, decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertEquals("Unknown", decoder.getManufacturer());
    }

    @Test
    public void testDecodeChannel() {
        Channel channel = MockChannel.createSocketChannel();
        SocketAddress remoteAddress = MockSocketAddress.create();
        Object msg = "Hello";
        String encodedMessage = encodeString(msg);
        assertEquals(1024, encodedMessage.length(), 0);
        Object decodedMessage;
        try {
            decodedMessage = decoder.decode(channel, remoteAddress, encodedMessage);
        } catch (Exception e) {
            return;
        }
        assertNotNull(decodedMessage);
        assertTrue(decodedMessage instanceof String);
    }

    @Test
    public void testDecodeUnpooledBuffer() {
        ByteBuf byteBuf = MockByteBuf.create();
        String encodedMessage = encodeString("Hello");
        assertEquals(1024, encodedMessage.length(), 0);
        Object decodedMessage;
        try {
            decodedMessage = decoder.decode(byteBuf, null, encodedMessage);
        } catch (Exception e) {
            return;
        }
        assertNotNull(decodedMessage);
        assertTrue(decodedMessage instanceof String);
    }

    @Test
    public void testDecodeNetworkMessage() {
        Network network = MockNetwork.create();
        CellTower cellTower = MockCellTower.create();
        WifiAccessPoint wifiAccessPoint = MockWifiAccessPoint.create();
        Position position = MockPosition.create(cellTower, wifiAccessPoint);
        NetworkMessage networkMessage = MockNetworkMessage.create(network, position);
        String encodedMessage = encodeString(networkMessage.toString());
        assertEquals(1024, encodedMessage.length(), 0);
        Object decodedMessage;
        try {
            decodedMessage = decoder.decode(MockChannel.createSocketChannel(), MockSocketAddress.create(null), encodedMessage);
        } catch (Exception e) {
            return;
        }
        assertNotNull(decodedMessage);
        assertTrue(decodedMessage instanceof String);
    }

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