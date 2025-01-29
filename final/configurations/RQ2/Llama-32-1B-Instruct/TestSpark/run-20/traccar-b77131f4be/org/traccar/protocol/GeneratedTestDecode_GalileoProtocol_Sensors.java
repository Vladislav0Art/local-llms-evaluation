package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDecode_GalileoProtocol_Sensors {

    private final Protocol protocol = new Protocol();
    private final Position position = new Position(0, 0, Calendar.getInstance());

    @Test
    public void testDecode_GalileoProtocol_Sensors() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(SensorsProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(SensorsProtocol.decode, ((Object) result).getClass());
    }

}