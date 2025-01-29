package org.traccar.protocol;

public class GeneratedTestDecodeWifiAccessPoint {

    @Test
    public void testDecodeWifiAccessPoint() {
        // Arrange
        WifiAccessPoint wifiAccessPoint = mock(WifiAccessPoint.class);
        SocketAddress remoteAddress = new SocketAddress(123, 456);
        Protocol protocol = mock(Protocol.class);

        // Act
        Object decodedObject = decoder.decode(wifiAccessPoint, remoteAddress, null);

        // Assert
        verify(protocol).getManufacturer(decodedObject != null ? (String) decodedObject.getManufacturer() : null);
    }

}