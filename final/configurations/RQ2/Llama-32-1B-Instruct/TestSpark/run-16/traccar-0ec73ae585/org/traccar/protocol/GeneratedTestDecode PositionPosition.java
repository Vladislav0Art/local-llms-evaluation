package org.traccar.protocol;

public class GeneratedTestDecode PositionPosition {

    @Test
    public void testDecode

    PositionPosition() {
        // Arrange
        Position position = new Position();
        SocketAddress remoteAddress = new SocketAddress(123, 456);
        Protocol protocol = mock(Protocol.class);

        // Act
        Object decodedObject = decoder.decode(position, remoteAddress, null);

        // Assert
        verify(protocol).getManufacturer();
    }

}