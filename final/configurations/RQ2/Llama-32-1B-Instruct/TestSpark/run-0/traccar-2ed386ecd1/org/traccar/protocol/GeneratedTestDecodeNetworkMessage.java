package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTestDecodeNetworkMessage {

    @Test
    public void testDecodeNetworkMessage() throws Exception {
        // Arrange
        byte[] message = new byte[1000];
        BufferUtil.writeByte(message, 0);
        Network network = new Network();
        network.setId(123L);
        network.setLatitude(37.7749);
        network.setLongitude(-122.4194);

        // Act
        Object result = Gt06ProtocolDecoder.Gt06ProtocolDecoder.decodeNetworkMessage(message, network);

        // Assert
        assertNotNull(result);
    }

}