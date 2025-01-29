package org.traccar.protocol;

public class GeneratedTestDecode WifiAccessPointWifiAccessPoint {

    @Test
    public void testDecode

    WifiAccessPointWifiAccessPoint() {
        // Arrange
        WifiAccessPoint wifiAccessPoint = new WifiAccessPoint();
        SocketAddress remoteAddress = new SocketAddress(123, 456);
        Protocol protocol = mock(Protocol.class);

        // Act
        Object decodedObject = decoder.decode(wifiAccessPoint, remoteAddress, null);

        // Assert
        verify(protocol).getManufacturer();
    }

}