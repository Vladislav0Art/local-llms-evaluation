package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() throws Exception {
        // Arrange
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        byte[] positionBytes = {1, 2, 3, 4, 5}; // Position object

        // Act
        Object decodedPosition = decoder.decode(
                ChannelUtils.createChannel(),
                SocketAddressUtils.getSocketAddress("192.168.1.1", 12345),
                new ByteBuf(new Unpooled()), positionBytes);

        // Assert
        Position position = (Position) decodedPosition;
        assertEquals(1, position.getX());
        assertEquals(2, position.getY());
    }

}