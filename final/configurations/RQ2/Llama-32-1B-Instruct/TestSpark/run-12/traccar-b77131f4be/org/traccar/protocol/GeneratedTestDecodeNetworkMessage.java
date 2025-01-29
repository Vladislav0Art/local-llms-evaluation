package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocol;
import org.traccar.protocol.NetworkMessage;

public class GeneratedTestDecodeNetworkMessage {

    public static void main(String[] args) {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
    }

    @Test
    public void testDecodeNetworkMessage() throws Exception {
        // Arrange
        byte[] data = Unpooled.buffer().writeByte(0x01).writeShort(0x2001).writeLong(0x12345678901234567890L);
        Channel channel = Unpooled.newBufferChannel();
        SocketAddress remoteAddress = Unpooled.newSocketaddr("192.168.1.100", 50051);
        DeviceSession deviceSession = new DeviceSession(remoteAddress);

        // Act
        Object result = decoder.decode(channel, remoteAddress, data);

        // Assert
        NetworkMessage networkMessage = (NetworkMessage) result;
        assertEquals(0x01, networkMessage.getCommand());
    }

}