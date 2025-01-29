package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        boolean result = decoder.getHasIndex();
        assertEquals(true, result);
    }

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        String result = decoder.getManufacturer();
        assertEquals("Traccar", result);
    }

    @Test
    public void testDecode() throws Exception {
        Object msg = new Network();
        when(baseProtocolDecoder.decode(any(CHANNEL, any(SocketAddress), any(Object)))).thenReturn(msg);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        byte[] bytes = (byte[]) decoder.decode(null, null, "some message");

        assertEquals("some message", new String(bytes));
    }

    @Test
    public void testDecode_SingleCellTower() throws Exception {
        Object msg = new CellTower();
        when(baseProtocolDecoder.decode(any(CHANNEL, any(SocketAddress), any(Object)))).thenReturn(msg);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        byte[] bytes = (byte[]) decoder.decode(null, null, "some message");

        assertEquals("some message", new String(bytes));
    }

    @Test
    public void testDecode_WifiAccessPoint() throws Exception {
        Object msg = new WifiAccessPoint();
        when(baseProtocolDecoder.decode(any(CHANNEL, any(SocketAddress), any(Object)))).thenReturn(msg);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        byte[] bytes = (byte[]) decoder.decode(null, null, "some message");

        assertEquals("some message", new String(bytes));
    }

    @Test
    public void testDecode_InvalidMessage() throws Exception {
        Object msg = new Network();
        when(baseProtocolDecoder.decode(any(CHANNEL, any(SocketAddress), any(Object)))).thenReturn(msg);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        byte[] bytes = (byte[]) decoder.decode(null, null, "some message");

        assertEquals("Invalid message", new String(bytes));
    }

    @Test
    public void testHasIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        boolean result = decoder.getHasIndex();
        assertTrue(result);
    }

}