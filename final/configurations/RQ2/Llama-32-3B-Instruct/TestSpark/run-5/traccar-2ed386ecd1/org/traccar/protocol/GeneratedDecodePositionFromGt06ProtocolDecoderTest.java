package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePositionFromGt06ProtocolDecoderTest {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @Mock
    private ByteBuf buf;

    @InjectMocks
    private Gt06ProtocolDecoder gt06ProtocolDecoder;

    @Test
    public void decodePositionFromGt06ProtocolDecoderTest() {
        // Arrange
        when(gt06ProtocolDecoder.decode(any(), any(), any())).thenReturn("position");

        // Act
        Object result = gt06ProtocolDecoder.decode(deviceSession, deviceSession.getRemoteAddress(), networkMessage);

        // Assert
        assertEquals(networkMessage, result);
    }

}