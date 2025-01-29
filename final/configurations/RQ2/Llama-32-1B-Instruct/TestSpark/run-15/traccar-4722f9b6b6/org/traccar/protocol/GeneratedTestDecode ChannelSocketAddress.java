package org.traccar.protocol;

public class GeneratedTestDecode ChannelSocketAddress {

    @Test
    public void testDecode

    ChannelSocketAddress() throws Exception {
        // Arrange
        Channel channel = new Channel();
        SocketAddress socketAddress = PatternBuilder.toSocketAddress(channel, 12345);

        // Act
        Object message = decoder.decode(socketAddress, null, null);

        // Assert
        assertEquals(12345, (Integer) message);
    }

}