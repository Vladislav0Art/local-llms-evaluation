package org.traccar.protocol;

public class GeneratedTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder();

    @Test
    public void testGetHasIndex() {
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        assertEquals("Watch", decoder.getManufacturer());
    }

    @Test
    public void testDecode() {
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object msg = null;
        assertNotNull(decoder.decode(channel, remoteAddress, msg));
    }

}