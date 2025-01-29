package org.traccar.protocol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodeGt06ProtocolDecodePositionWithUnknownFields {

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