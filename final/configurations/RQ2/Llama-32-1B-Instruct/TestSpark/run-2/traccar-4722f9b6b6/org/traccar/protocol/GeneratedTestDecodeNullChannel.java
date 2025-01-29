package org.traccar.protocol;

public class GeneratedTestDecodeNullChannel {

    @Test
    public void testDecodeNullChannel() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertNull(decoder.getHasIndex());
        assertNotNull(decoder.getManufacturer());

        assertEquals(null, decoder.getManufacturer());
    }

}