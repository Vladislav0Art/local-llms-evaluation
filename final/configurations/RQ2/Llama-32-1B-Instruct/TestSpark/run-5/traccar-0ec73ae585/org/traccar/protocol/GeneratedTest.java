package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean hasIndex = decoder.getHasIndex();
        assertEquals(true, hasIndex);
    }

    @Test
    public void testGetManufacturer() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String manufacturer = decoder.getManufacturer();
        assertNotNull(manufacturer);
        assertEquals("TRACCA", manufacturer);
    }

    @Test
    public void testDecodeChannel() {
        Protocol protocol = new Protocol();
        Channel channel = mock(Channel.class);
        Object msg = mock(Object.class);
        try (BufferedWriter writer = new BufferedWriter(new Unpooled())) {
            decoder.decode(channel, mock(SocketAddress.class), msg);
            assertNotNull(writer);
            assertEquals(10000, writer.length());
        }
    }

    @Test
    public void testDecodePosition() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Position position = decoder.decode(Position.class);
        assertNotNull(position);
        assertEquals(37.7749, position.getLatitude(), 0.001);
        assertEquals(-122.4194, position.getLongitude(), 0.001);
    }

    @Test
    public void testDecodeCellTower() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        CellTower cellTower = decoder.decode(CellTower.class);
        assertNotNull(cellTower);
        assertEquals(2, cellTower.getId());
    }

}