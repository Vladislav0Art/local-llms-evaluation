package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testDecode_GalileoProtocol() {
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

    public NetworkMessage createNetworkMessage(Protocol protocol, DeviceSession device, Position position) {
        ByteBufUtil.copy(device.getSocket().getReader(), Unpooled.buffer());
        BitBuffer bitBuffer = new BitBuffer();
        bitBuffer.putShort((short) protocol.getGalileoId());
        bitBuffer.putLong((long) position.getTime());
        NetworkMessage networkMessage = new NetworkMessage(bitBuffer.toByteArray(), device.getSocket().getWriter());
        return networkMessage;
    }

    @Test
    public void testDecode_GalileoProtocol_Binary() {
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

    @Test
    public void testDecode_GalileoProtocol_Unpooled() {
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

    @Test
    public void testDecode_GalileoProtocol_PartialDecoded() {
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

    @Test
    public void testDecode_GalileoProtocol_Empty() {
        // Arrange
        Protocol protocol = new Protocol();

        // Act
        Object decodedObject = decode(channel, remoteAddress, null);

        // Assert
        assertNull(decodedObject);
    }

}