package org.traccar.protocol;

public class GeneratedTestDecodeDeviceSession {

    @Test
    public void testDecodeDeviceSession() throws Exception {
        // Arrange
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        String deviceSessionId = "device_session_id";
        byte[] deviceSessionBytes = {1, 2, 3}; // Device session object

        // Act
        Object decodedDeviceSession = decoder.decode(
                ChannelUtils.createChannel(),
                SocketAddressUtils.getSocketAddress("192.168.1.1", 12345),
                new ByteBuf(new Unpooled()), deviceSessionBytes);

        // Assert
        DeviceSession deviceSession = (DeviceSession) decodedDeviceSession;
        assertEquals(deviceSessionId, deviceSession.getId());
    }

}