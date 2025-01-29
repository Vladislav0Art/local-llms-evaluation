package org.traccar.protocol;

public class GeneratedTestDecodeWifiAccessPoint {

    @Test
    public void testDecodeWifiAccessPoint() {
        // Arrange
        WifiAccessPoint wifiAccessPoint = null;
        SocketAddress remoteAddress = MockSocketAddress();
        Object msg = MockMessage();
        Protocol protocol = MockProtocol.INSTANCE;

        // Act
        Object result = WatchProtocolDecoder.decode(wifiAccessPoint, remoteAddress, msg);

        // Assert
        assertTrue(WatchProtocolDecoder.class.isAssignableFrom(result.getClass()));
    }

}