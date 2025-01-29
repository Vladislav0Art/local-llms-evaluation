package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocol;
import org.traccar.protocol.NetworkMessage;

public class GeneratedTestDecodeEmptyData {

    public static void main(String[] args) {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
    }

    @Test
    public void testDecodeEmptyData() throws Exception {
        // Arrange
        Channel channel = Unpooled.newBufferChannel();
        SocketAddress remoteAddress = Unpooled.newSocketaddr("192.168.1.100", 50051);
        DeviceSession deviceSession = new DeviceSession(remoteAddress);

        // Act
        Object result = decoder.decode(channel, remoteAddress, Unpooled.buffer().writeShort(0x01).writeInt(0x2001));

        // Assert
        try {
            ((NetworkMessage) result).decode(new ByteBuf(), null);
        } catch (Exception e) {
            fail("Expected exception");
        }
    }

}