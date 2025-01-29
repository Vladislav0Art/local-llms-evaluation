package org.traccar.protocol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private Channel channel;
    private Protocol protocol;
    private Position position;
    private byte[] data;
    private SocketAddress remoteAddress;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        protocol = new Protocol();
    }

    @Test
    public void testDecodeGt06ProtocolDecodePositionWithLengthAndSpeed() throws Exception {
        // Arrange
        position = new Position(10, 20, 30);
        data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        remoteAddress = "127.0.0.1:1234";

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, data, true, false, false, TimeZone.getDefault());

        // Assert
        Mockito.verify(protocol).decode("", "", true, false, false, TimeZone.getDefault());
    }

    @Test
    public void testDecodeGt06ProtocolDecodePositionWithLength() throws Exception {
        // Arrange
        position = new Position(10, 20, 30);
        data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        remoteAddress = "127.0.0.1:1234";

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, data, true, false, false, TimeZone.getDefault());

        // Assert
        Mockito.verify(protocol).decode("", "", false, false, false, TimeZone.getDefault());
    }

    @Test
    public void testDecodeGt06ProtocolDecodePositionWithSatellites() throws Exception {
        // Arrange
        position = new Position(10, 20, 30);
        data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        remoteAddress = "127.0.0.1:1234";
        boolean satellites = true;

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, data, false, satellites, false, TimeZone.getDefault());

        // Assert
        Mockito.verify(protocol).decode("", "", false, satellites, false, TimeZone.getDefault());
    }

    @Test
    public void testDecodeGt06ProtocolDecodePositionWithSpeed() throws Exception {
        // Arrange
        position = new Position(10, 20, 30);
        data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        remoteAddress = "127.0.0.1:1234";
        boolean speed = true;

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, data, false, false, speed, TimeZone.getDefault());

        // Assert
        Mockito.verify(protocol).decode("", "", false, false, speed, TimeZone.getDefault());
    }

    @Test
    public void testDecodeGt06ProtocolDecodePositionWithChecksum() throws Exception {
        // Arrange
        position = new Position(10, 20, 30);
        data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        remoteAddress = "127.0.0.1:1234";
        boolean hasLength = true;
        boolean hasChecksum = true;

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, data, hasLength, hasChecksum, false, TimeZone.getDefault());

        // Assert
        Mockito.verify(protocol).decode("", "", hasLength, hasChecksum, false, TimeZone.getDefault());
    }

    @Test
    public void testDecodeGt06ProtocolDecodePositionWithChecksumAndSpeed() throws Exception {
        // Arrange
        position = new Position(10, 20, 30);
        data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        remoteAddress = "127.0.0.1:1234";
        boolean hasLength = true;
        boolean hasChecksum = true;
        boolean hasSpeed = true;

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, data, hasLength, hasChecksum, hasSpeed, TimeZone.getDefault());

        // Assert
        Mockito.verify(protocol).decode("", "", hasLength, hasChecksum, hasSpeed, TimeZone.getDefault());
    }

    @Test
    public void testDecodeGt06ProtocolDecodePositionWithUnknownFields() throws Exception {
        // Arrange
        position = new Position(10, 20, 30);
        data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        remoteAddress = "127.0.0.1:1234";
        boolean hasLength = true;
        boolean hasChecksum = true;

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, data, hasLength, hasChecksum, false, TimeZone.getDefault());

        // Assert
        Mockito.verifyNoInteractions(protocol);
    }

}