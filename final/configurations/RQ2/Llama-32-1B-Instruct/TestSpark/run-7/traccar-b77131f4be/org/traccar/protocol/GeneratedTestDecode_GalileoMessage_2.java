package org.traccar.protocol;

public class GeneratedTestDecode_GalileoMessage_2 {

    private Protocol protocol;

    @Test
    public void testDecode_GalileoMessage_2() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(new Position(37.7749, -122.4194), new String("", StandardCharsets.UTF_8));

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("Hello, world!", (String) result);
    }

}