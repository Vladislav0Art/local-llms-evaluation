package org.traccar.protocol;

public class GeneratedTestDecodeCellTowerMessage {

    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
    private final SocketAddress remoteAddress;
    private final Channel channel;

    @Before
    public void setup() {
        remoteAddress = new SocketAddress("127.0.0.1", 8888);
        channel = NettyUtil.createChannel();
    }

    public void testGetHasIndex() throws Exception {
        buffer = BufferUtil.getBytes("Hello World");
        int index = decoder.getHasIndex(buffer);
        assertEquals(0, index);
    }

    public void testGetManufacturer() throws Exception {
        buffer = BufferUtil.getBytes("Apple iPhone 13 Pro");
        String manufacturer = decoder.getManufacturer(buffer);
        assertNotNull(manufacturer);
    }

    @Test
    public void testDecodeCellTowerMessage() {
        byte[] cellTowerMessage = new byte[]{0x01, 0x02, 0x03};
        buffer = BufferUtil.getBytes(cellTowerMessage);
        CellTower cellTower = decoder.decode(channel, remoteAddress, null);
        assertNotNull(cellTower);
    }

}