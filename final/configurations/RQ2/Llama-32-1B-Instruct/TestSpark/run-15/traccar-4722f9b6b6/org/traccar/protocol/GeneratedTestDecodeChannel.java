package org.traccar.protocol;

public class GeneratedTestDecodeChannel {

    @Test
    public void testDecodeChannel() throws Exception {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = new Channel();
        Object message = decoder.decode(channel, null, null);

        assertNotNull(message);
        assertEquals(12345, (Integer) message);
    }

}