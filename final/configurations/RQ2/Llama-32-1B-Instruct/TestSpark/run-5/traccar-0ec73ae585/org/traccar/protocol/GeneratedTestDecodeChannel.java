package org.traccar.protocol;

public class GeneratedTestDecodeChannel {

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

}