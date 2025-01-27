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
public class GeneratedDecodeGpsPositionHasSatellitesTest {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @Mock
    private ByteBuf buf;

    @InjectMocks
    private Gt06ProtocolDecoder gt06ProtocolDecoder;

    @Test
    public void decodeGpsPositionHasSatellitesTest() {
        // Arrange
        Position position = new Position(1, 2, 3);
        when(deviceSession.getPosition()).thenReturn(position);

        // Act
        boolean result = gt06ProtocolDecoder.decodeGps(position, buf, false, true);

        // Assert
        assertTrue(result);
    }

}