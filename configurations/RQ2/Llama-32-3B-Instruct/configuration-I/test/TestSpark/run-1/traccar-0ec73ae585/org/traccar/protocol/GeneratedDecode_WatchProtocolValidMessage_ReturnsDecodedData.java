package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecode_WatchProtocolValidMessage_ReturnsDecodedData {

    @Test
    public void decode_WatchProtocolValidMessage_ReturnsDecodedData() throws Exception {
        // Arrange
        Object decoded = Mockito.mock(Object.class);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        String[] decodedData = {"data1", "data2"};
        WatchProtocolDecoder decoder = new WatchProtocolDecoder("WatchProtocol");
        protocol.setValidMessage(true);

        // Act
        Object result = decoder.decode(channel, remoteAddress, decodedData[0] + ":" + decodedData[1]);

        // Assert
        assertEquals(decoded, result);
    }

}