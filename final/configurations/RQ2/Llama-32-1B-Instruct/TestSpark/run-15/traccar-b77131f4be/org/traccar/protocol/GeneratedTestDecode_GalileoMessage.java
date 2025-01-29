package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoMessage {

    @Test
    public void testDecode_GalileoMessage() {
        // Arrange
        Protocol protocol = Mockito.mock(Protocol.class);
        BaseProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        // Act
        Object msg = decoder.decode(
                Mockito.mock(Channel.class),
                Mockito.mock(SocketAddress.class),
                Mockito.mock(NetworkMessage.class)
        );

        // Assert
        Mockito.verify(msg, Mockito.times(1)).equals("Galileo");
    }

}