package org.traccar.protocol;

public class GeneratedTestDecode {

    private MockedChannel channel;

    @Mock
    public void mockChannel() {
        this.channel = new MockedChannel();
    }

    public static class MockedChannel extends Channel {
        @Override
        public ByteBuf alloc() {
            return Unpooled.buffer();
        }
    }

    private SocketAddress remoteAddress;

    @Test
    public void testDecode() throws Exception {
        // Given
        GalileoProtocolDecoder protocol = new GalileoProtocolDecoder();
        when(channel.alloc()).thenReturn(Unpooled.buffer());
        when(remoteAddress).thenReturn("localhost");

        // When
        Object result = protocol.decode(channel, remoteAddress);
        // Then
        assertEquals(42, (Integer) result);
    }

}