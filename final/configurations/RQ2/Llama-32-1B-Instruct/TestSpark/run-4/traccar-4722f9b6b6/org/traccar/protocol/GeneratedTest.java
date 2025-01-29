package org.traccar.protocol;

public class GeneratedTest {

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
    public void testDecodeChannelMessage() {
        byte[] channelMessage = new byte[]{0x01, 0x02, 0x03};
        buffer = BufferUtil.getBytes(channelMessage);
        Channel message = NettyUtil.getChannel(buffer);
        assertEquals(3, message.readInt());
    }

    @Test
    public void testDecodePositionMessage() {
        byte[] positionMessage = new byte[]{0x01, 0x02, 0x03, 0x04};
        buffer = BufferUtil.getBytes(positionMessage);
        Position position = decoder.decode(channel, remoteAddress, null);
        assertNotNull(position);
    }

    @Test
    public void testDecodeCellTowerMessage() {
        byte[] cellTowerMessage = new byte[]{0x01, 0x02, 0x03};
        buffer = BufferUtil.getBytes(cellTowerMessage);
        CellTower cellTower = decoder.decode(channel, remoteAddress, null);
        assertNotNull(cellTower);
    }

    @Test
    public void testDecodeNetworkMessage() {
        byte[] networkMessage = new byte[]{0x01, 0x02, 0x03};
        buffer = BufferUtil.getBytes(networkMessage);
        Network network = decoder.decode(channel, remoteAddress, null);
        assertNotNull(network);
    }

}