package org.traccar.protocol;

public class GeneratedTestDecodeSocketAddress {

    @Test
    public void testDecodeSocketAddress() throws Exception {
        SocketAddress socketAddress = PatternBuilder.toSocketAddress(new Unpooled(), 12345);
        Object message = decoder.decode(socketAddress, null, null);

        assertNotNull(message);
        assertEquals(12345, (Integer) message);
    }

}