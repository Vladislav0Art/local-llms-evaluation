package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoEmptyMessage {

    @Test
    public void testDecode_GalileoEmptyMessage() throws Exception {
        // Arrange
        Channel channel = Mockito.mock(Channel.class);

        // Act
        byte[] decodedMsg = new GalileoProtocolDecoder().decode(channel, null, null);

        // Assert
        assertEquals(null, getByteArrayInputStream(decodedMsg));
    }

}