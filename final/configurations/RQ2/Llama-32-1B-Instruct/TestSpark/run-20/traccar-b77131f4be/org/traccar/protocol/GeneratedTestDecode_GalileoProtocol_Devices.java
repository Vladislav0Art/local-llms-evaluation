package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDecode_GalileoProtocol_Devices {

    private final Protocol protocol = new Protocol();
    private final Position position = new Position(0, 0, Calendar.getInstance());

    @Test
    public void testDecode_GalileoProtocol_Devices() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(DevicesProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(DevicesProtocol.decode, ((Object) result).getClass());
    }

}