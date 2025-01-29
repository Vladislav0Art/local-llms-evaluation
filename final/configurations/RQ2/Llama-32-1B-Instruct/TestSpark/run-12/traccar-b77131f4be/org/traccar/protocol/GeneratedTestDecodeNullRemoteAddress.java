package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocol;
import org.traccar.protocol.NetworkMessage;

public class GeneratedTestDecodeNullRemoteAddress {

    public static void main(String[] args) {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
    }

    @Test
    public void testDecodeNullRemoteAddress() throws Exception {
        // Arrange
        Channel channel = Unpooled.newBufferChannel();
        DeviceSession deviceSession = new DeviceSession(null);

        // Act
        Object result = decoder.decode(channel, null, Unpooled.buffer().writeShort(0x01).writeInt(0x2001));

        // Assert
        try {
            ((NetworkMessage) result).decode(new ByteBuf(), "null remote address");
        } catch (Exception e) {
            fail("Expected exception");
        }
    }

}