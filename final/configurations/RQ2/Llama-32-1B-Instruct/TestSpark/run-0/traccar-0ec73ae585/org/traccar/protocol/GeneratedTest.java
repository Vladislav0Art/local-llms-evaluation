package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertEquals("watch", decoder.getManufacturer());
    }

    @Test
    public void testDecodeSingleCellTower() throws Exception {
        String cellTowerData = "1234567890ABCDEGHIJKLMNOPQRSTUVWXYZ";
        ByteBuf byteBuf = BufferUtil.newByteBuf(cellTowerData, 16);
        Channel channel = Unpooled.buffer();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 8888);

        BaseProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        Object message = decoder.decode(channel, remoteAddress, byteBuf);

        Position position = Parser.parsePosition(message);
        assertTrue(position != null);
    }

    @Test
    public void testDecodeCellTowerList() throws Exception {
        String cellTowerData = "1234567890ABCDEGHIJKLMNOPQRSTUVWXYZ";
        ByteBuf byteBuf = BufferUtil.newByteBuf(cellTowerData, 16);
        Channel channel = Unpooled.buffer();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 8888);

        BaseProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        Object message = decoder.decode(channel, remoteAddress, byteBuf);

        List<CellTower> cellTowers = Parser.parseListCellTowers(message);
        assertTrue(cellTowers != null);
    }

    @Test
    public void testDecodeNetwork() throws Exception {
        String networkData = "1234567890ABCDEGHIJKLMNOPQRSTUVWXYZ";
        ByteBuf byteBuf = BufferUtil.newByteBuf(networkData, 32);
        Channel channel = Unpooled.buffer();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 8888);

        BaseProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        Object message = decoder.decode(channel, remoteAddress, byteBuf);

        Network network = Parser.parseNetwork(message);
        assertTrue(network != null);
    }

    @Test
    public void testDecodePosition() throws Exception {
        String positionData = "1234567890ABCDEGHIJKLMNOPQRSTUVWXYZ";
        ByteBuf byteBuf = BufferUtil.newByteBuf(positionData, 16);
        Channel channel = Unpooled.buffer();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 8888);

        BaseProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        Object message = decoder.decode(channel, remoteAddress, byteBuf);

        Position position = Parser.parsePosition(message);
        assertTrue(position != null);
    }

}