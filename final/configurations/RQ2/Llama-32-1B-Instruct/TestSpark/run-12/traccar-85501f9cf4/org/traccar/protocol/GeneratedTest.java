package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void decodeGpsTest() {
        ByteBuf buf = new Unpooled().encode("1234567890");
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, false, null) == 1);

        position = new Position();
        position.setLatitude(37.78585);
        position.setLongitude(-122.4365);
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, false, null) == 2);

        buf.clear();
        assertFalse(Gt06ProtocolDecoder.decodeGps(new Position(), buf, false, true, false, null));
    }

    @Test
    public void decodeChannelTest() {
        Channel channel = new Channel(1234);
        SocketAddress remoteAddress = new SocketAddress("192.168.1.1", 12345);
        assertTrue(Gt06ProtocolDecoder.decodeGt06(channel, remoteAddress, false, null) == true);

        assertFalse(Gt06ProtocolDecoder.decodeGt06(new Channel(5678), remoteAddress, false, null));
    }

    @Test
    public void decodeMessageTest() {
        Network network = new Network();
        CellTower cellTower = new CellTower();
        cellTower.setCellId("1234567890");
        cellTower.setLongitude(-122.4194);
        assertTrue(Gt06ProtocolDecoder.decodeGt06(network, cellTower, true, null) == true);

        assertFalse(Gt06ProtocolDecoder.decodeGt06(new Network(), cellTower, true, null));
    }

    @Test
    public void decodeChecksumTest() {
        ByteBuf buf = new Unpooled().encode("1234567890");
        assertTrue(PatternBuilder.isChecksum(buf) == false);
    }

}