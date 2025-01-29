package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDecode_GalileoProtocol_GalileoVersionNumberZero {

    private final Protocol protocol = new Protocol();
    private final Position position = new Position(0, 0, Calendar.getInstance());

    @Test
    public void testDecode_GalileoProtocol_GalileoVersionNumberZero() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

}