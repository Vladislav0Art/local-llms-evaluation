package org.traccar.protocol;

public class GeneratedTestDecodeCellTower {

    @Test
    public void testDecodeCellTower() {
        // Arrange
        CellTower cellTower = mock(CellTower.class);
        SocketAddress remoteAddress = new SocketAddress(123, 456);
        Protocol protocol = mock(Protocol.class);

        // Act
        Object decodedObject = decoder.decode(cellTower, remoteAddress, null);

        // Assert
        verify(protocol).getHasIndex(decodedObject != null ? (String) decodedObject.getIdentifier() : null);
    }

}