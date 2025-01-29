package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocol;
import org.traccar.protocol.NetworkMessage;

public class GeneratedTestDecodePosition {

    public static void main(String[] args) {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
    }

    @Test
    public void testDecodePosition() throws Exception {
        // Arrange
        byte[] data = Unpooled.buffer().writeShort(0x01).writeInt(0x2001).writeLong(0x12345678901234567890L);
        Channel channel = Unpooled.newBufferChannel();
        SocketAddress remoteAddress = Unpooled.newSocketaddr("192.168.1.100", 50051);
        DeviceSession deviceSession = new DeviceSession(remoteAddress);

        // Act
        Object result = decoder.decode(channel, remoteAddress, data);

        // Assert
        Position position = (Position) result;
        assertEquals(0x01, position.getX());
        assertEquals(0x2001, position.getY());
    }

}