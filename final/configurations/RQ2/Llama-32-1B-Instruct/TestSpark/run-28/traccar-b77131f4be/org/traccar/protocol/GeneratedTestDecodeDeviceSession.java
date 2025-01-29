package org.traccar.protocol;

public class GeneratedTestDecodeDeviceSession {

    @Test
    public void testDecodeDeviceSession() {
        // Arrange
        ByteBuf byteBuf = new Unpooled();
        DeviceSession deviceSession = new DeviceSession(new SocketAddress("192.168.1.100"), 12345, new Calendar());

        // Act
        Object result = decode(deviceSession, byteBuf);

        // Assert
        assertEquals(12345, ((DeviceSession) result).getSocketAddress().getPort(), "Bytes");
    }

}