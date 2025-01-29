package org.traccar.protocol;

public class GeneratedTestGetManufacturer_ReturnsDeviceString {

    private MockWatchProtocolDecoder decoder;

    @Before
    public void setUp() {
        decoder = new MockWatchProtocolDecoder();
    }

    @Test
    public void testGetManufacturer_ReturnsDeviceString() throws Exception {
        // Arrange
        Object message = new MockDeviceSession("device", "test");
        Channel channel = MockChannel.create(1);
        SocketAddress remoteAddress = MockSocketAddress.create(1, 1);

        when(message.getSocketAddress()).thenReturn(remoteAddress);
        when(channel.isOpen()).thenReturn(true);

        // Act
        String result = decoder.getManufacturer().call(message, channel, remoteAddress);

        // Assert
        assertEquals("device", result);
    }

}