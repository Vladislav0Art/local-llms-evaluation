package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocol;
import org.traccar.protocol.NetworkMessage;

public class GeneratedTestDecodeError {

    public static void main(String[] args) {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
    }

    @Test
    public void testDecodeError() throws Exception {
        // Arrange
        byte[] data = Unpooled.buffer().writeShort(0x01).writeInt(0x2001);
        Channel channel = Unpooled.newBufferChannel();
        SocketAddress remoteAddress = Unpooled.newSocketaddr("192.168.1.100", 50051);
        DeviceSession deviceSession = new DeviceSession(remoteAddress);

        // Act
        Object result = decoder.decode(channel, remoteAddress, data);

        // Assert
        try {
            ((NetworkMessage) result).decode(new ByteBuf(), "invalid data");
        } catch (Exception e) {
            fail("Expected exception");
        }
    }

}