package org.traccar.protocol;

public class GeneratedTestDecode CellTowerCellTower {

    @Test
    public void testDecode

    CellTowerCellTower() {
        // Arrange
        CellTower cellTower = new CellTower();
        SocketAddress remoteAddress = new SocketAddress(123, 456);
        Protocol protocol = mock(Protocol.class);

        // Act
        Object decodedObject = decoder.decode(cellTower, remoteAddress, null);

        // Assert
        verify(protocol).getManufacturer();
    }

}