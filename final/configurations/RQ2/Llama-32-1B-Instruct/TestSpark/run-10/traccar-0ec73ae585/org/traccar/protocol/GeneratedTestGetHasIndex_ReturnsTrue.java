package org.traccar.protocol;

public class GeneratedTestGetHasIndex_ReturnsTrue {

    private MockWatchProtocolDecoder decoder;

    @Before
    public void setUp() {
        decoder = new MockWatchProtocolDecoder();
    }

    @Test
    public void testGetHasIndex_ReturnsTrue() throws Exception {
        // Arrange
        Object message = new MockDeviceSession("device", "test");
        Channel channel = MockChannel.create(1);
        SocketAddress remoteAddress = MockSocketAddress.create(1, 1);

        when(message.getSocketAddress()).thenReturn(remoteAddress);
        when(channel.isOpen()).thenReturn(true);

        // Act
        boolean result = decoder.getHasIndex().call(message, channel, remoteAddress);

        // Assert
        assertTrue(result);
    }

}