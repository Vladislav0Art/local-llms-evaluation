package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecodeDecodeMethodTest {

    @Test
    public void decodeDecodeMethodTest() throws Exception {
        // Arrange and Act
        Object obj = new GalileoProtocolDecoder(Mockito.mock(Protocol.class));
        String result = (String) ((GalileoProtocolDecoder) obj).decode(
                Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), Mockito.mock(Object.class));

        // Assert
        assertNotNull(result);
    }

}