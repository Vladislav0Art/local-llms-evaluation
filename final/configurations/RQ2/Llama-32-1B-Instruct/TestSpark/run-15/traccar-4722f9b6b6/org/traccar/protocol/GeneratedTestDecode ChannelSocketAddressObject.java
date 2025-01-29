package org.traccar.protocol;

public class GeneratedTestDecode ChannelSocketAddressObject {

    @Test
    public void testDecode

    ChannelSocketAddressObject() throws Exception {
        // Arrange
        SocketAddress socketAddress = new SocketAddress(new Unpooled(), 12345);

        // Act
        Object message = decoder.decode(socketAddress, null, null);

        // Assert
        assertEquals(12345, (Integer) message);
    }

}