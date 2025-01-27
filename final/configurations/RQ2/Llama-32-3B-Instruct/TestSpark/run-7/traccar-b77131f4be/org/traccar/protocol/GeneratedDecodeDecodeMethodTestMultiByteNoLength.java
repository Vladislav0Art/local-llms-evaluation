package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecodeDecodeMethodTestMultiByteNoLength {

    @Test
    public void decodeDecodeMethodTestMultiByteNoLength() throws Exception {
        // Arrange and Act
        Object obj = new GalileoProtocolDecoder(Mockito.mock(Protocol.class));
        String result = (String) ((GalileoProtocolDecoder) obj).decode(
                Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), new byte[]{1, 2, 3});

        // Assert
        assertNotNull(result);
    }

}