package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() {
        // Arrange
        Position position = mock(Position.class);
        SocketAddress remoteAddress = new SocketAddress(123, 456);
        Protocol protocol = mock(Protocol.class);

        // Act
        Object decodedObject = decoder.decode(position, remoteAddress, null);

        // Assert
        verify(protocol).getManufacturer(decodedObject != null ? (String) decodedObject.getManufacturer() : null);
    }

}