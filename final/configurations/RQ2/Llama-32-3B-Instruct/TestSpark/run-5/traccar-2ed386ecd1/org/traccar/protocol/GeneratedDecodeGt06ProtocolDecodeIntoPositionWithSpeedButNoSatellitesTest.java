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
public class GeneratedDecodeGt06ProtocolDecodeIntoPositionWithSpeedButNoSatellitesTest {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @Mock
    private ByteBuf buf;

    @InjectMocks
    private Gt06ProtocolDecoder gt06ProtocolDecoder;

    @Test
    public void decodeGt06ProtocolDecodeIntoPositionWithSpeedButNoSatellitesTest() {
        // Arrange
        when(gt06ProtocolDecoder.decode(any(), any(), any())).thenReturn(positionWithSpeed());

        // Act
        Object result = gt06ProtocolDecoder.decode(deviceSession, deviceSession.getRemoteAddress(), networkMessage);

        // Assert
        assertTrue(result instanceof Position);
    }

}