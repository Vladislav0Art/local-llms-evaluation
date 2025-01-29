package org.traccar.protocol;

public class GeneratedTestDecodeNetwork {

    @Test
    public void testDecodeNetwork() {
        // Arrange
        Network network = mock(Network.class);
        SocketAddress remoteAddress = new SocketAddress(123, 456);
        Protocol protocol = mock(Protocol.class);

        // Act
        Object decodedObject = decoder.decode(network, remoteAddress, null);

        // Assert
        verify(protocol).getHasIndex(decodedObject != null ? (String) decodedObject.getIdentifier() : null);
    }

}