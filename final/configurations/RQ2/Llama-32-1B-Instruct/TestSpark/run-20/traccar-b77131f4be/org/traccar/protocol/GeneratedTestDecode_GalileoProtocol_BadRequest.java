package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDecode_GalileoProtocol_BadRequest {

    private final Protocol protocol = new Protocol();
    private final Position position = new Position(0, 0, Calendar.getInstance());

    @Test
    public void testDecode_GalileoProtocol_BadRequest() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(BAD_REQUEST.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(BAD_REQUEST.decode, ((Object) result).getClass());
    }

}