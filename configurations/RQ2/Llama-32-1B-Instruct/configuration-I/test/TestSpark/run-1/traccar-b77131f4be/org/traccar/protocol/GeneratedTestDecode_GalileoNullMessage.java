package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoNullMessage {

    @Test
    public void testDecode_GalileoNullMessage() throws Exception {
        // Arrange
        Channel channel = Mockito.mock(Channel.class);

        // Act
        byte[] decodedMsg = new GalileoProtocolDecoder().decode(channel, null, null);

        // Assert
        assertEquals(0, getNumBytes(decodedMsg));
    }

    private static byte[] getByteArrayInputStream(Object input) {
        return (byte[]) input;
    }

    private static int getNumBytes(Object input) {
        return ((byte[]) input).length;
    }

}