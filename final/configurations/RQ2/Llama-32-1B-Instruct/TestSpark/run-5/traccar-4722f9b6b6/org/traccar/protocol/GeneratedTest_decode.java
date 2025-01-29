package org.traccar.protocol;

public class GeneratedTest_decode {

    @Test
    public void test_decode() throws Exception {
        ByteBuf bytesBuf = Unpooled.buffer();
        bytesBuf.writeByte(1);
        bytesBuf.writeByte(2);
        Network network = new Network();
        Position position = new Position(new Date(), network);
        CellTower cellTower = new CellTower(position, network);
        WifiAccessPoint wifiAccessPoint = new WifiAccessPoint(cellTower, Position.ZERO, new Date());
        Pattern pattern = PatternBuilder.createPattern(Protocol.WatchProtocol);
        NetworkMessage networkMessage = protocol.encode(wifiAccessPoint, position, cellTower, new Date(), pattern);
        Channel channel = null;
        Object msg = decoder.decode(channel, SocketAddress.NULL, networkMessage);
        assertNotNull(msg);
        assertEquals(wifiAccessPoint, msg instanceof WifiAccessPoint ? (WifiAccessPoint) msg : null);
        assertEquals(position, ((Position) msg).getValue());
    }

}