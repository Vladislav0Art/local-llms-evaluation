package org.traccar.protocol;

public class GeneratedTest {

    private Protocol protocol;

    @Test
    public void testDecode_GalileoMessage_1() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(new Position(37.7749, -122.4194), new String("Hello, world!", StandardCharsets.UTF_8));

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("Hello, world!", (String) result);
    }

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

    @Test
    public void testDecode_GalileoMessage_3() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(new Position(37.7749, -122.4194), null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("Hello, world!", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_4() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("Hello, world!", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_5() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("Hello, world!", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_6() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_7() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_8() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_9() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_10() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_11() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_12() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_13() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_14() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_15() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_16() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_17() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_18() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_19() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

    @Test
    public void testDecode_GalileoMessage_20() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(null, null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("", (String) result);
    }

}