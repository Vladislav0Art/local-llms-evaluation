package org.traccar.protocol;

public class GeneratedTestDecode NetworkNetwork {

    @Test
    public void testDecode

    NetworkNetwork() {
        // Arrange
        Network network = new Network();
        SocketAddress remoteAddress = new SocketAddress(123, 456);
        Protocol protocol = mock(Protocol.class);

        // Act
        Object decodedObject = decoder.decode(network, remoteAddress, null);

        // Assert
        verify(protocol).getManufacturer();
    }

}