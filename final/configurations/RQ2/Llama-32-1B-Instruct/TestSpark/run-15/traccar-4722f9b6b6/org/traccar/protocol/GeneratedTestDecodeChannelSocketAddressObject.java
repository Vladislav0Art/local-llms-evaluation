package org.traccar.protocol;

public class GeneratedTestDecodeChannelSocketAddressObject {

    @Test
    public void testDecodeChannelSocketAddressObject() throws Exception {
        Channel channel = new Channel();
        SocketAddress socketAddress = PatternBuilder.toSocketAddress(channel, 12345);
        Object message = decoder.decode(socketAddress, null, null);

        assertNotNull(message);
        assertEquals(12345, (Integer) message);
    }

}