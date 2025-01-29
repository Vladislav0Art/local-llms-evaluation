package org.traccar.protocol;

public class GeneratedTestDecode SocketAddress {

    @Test
    public void testDecode

    SocketAddress() throws Exception {
        // Arrange
        SocketAddress socketAddress = new SocketAddress(new Unpooled(), 12345);

        // Act
        Object message = decoder.decode(socketAddress, null, null);

        // Assert
        assertEquals(12345, (Integer) message);
    }

}