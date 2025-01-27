package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecodeDecodeMethodTestUnknownMessage {

    @Test
    public void decodeDecodeMethodTestUnknownMessage() throws Exception {
        // Arrange and Act
        Object obj = new GalileoProtocolDecoder(Mockito.mock(Protocol.class));
        String result = (String) ((GalileoProtocolDecoder) obj).decode(
                Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), Mockito.mock(NetworkMessage.class));

        // Assert
        assertNotNull(result);
    }

}