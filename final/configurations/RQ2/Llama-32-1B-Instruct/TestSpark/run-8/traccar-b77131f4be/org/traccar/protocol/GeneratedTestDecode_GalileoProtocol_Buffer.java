package org.traccar.protocol;

public class GeneratedTestDecode_GalileoProtocol_Buffer {

    @Test
    public void testDecode_GalileoProtocol_Buffer() {
        // Arrange
        Protocol protocol = new Protocol();
        DeviceSession device = new DeviceSession(new SocketAddress("127.0.0.1:1111"));
        Position position = new Position(new Calendar.getInstance(), 10);
        NetworkMessage networkMessage = createNetworkMessage(protocol, device, position);

        // Act
        Object decodedObject = decode(channel, remoteAddress, networkMessage);

        // Assert
        assertNotNull(decodedObject);
    }

}