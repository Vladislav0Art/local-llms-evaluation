package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        // Arrange
        String manufacturer = "TRACCA";
        SocketAddress remoteAddress = new SocketAddress(123, 456);
        Protocol protocol = mock(Protocol.class);

        // Act
        String manufacturerString = decoder.getManufacturer(remoteAddress, protocol);

        // Assert
        verify(manufacturer).getManufacturer(manufacturerString);
    }

}