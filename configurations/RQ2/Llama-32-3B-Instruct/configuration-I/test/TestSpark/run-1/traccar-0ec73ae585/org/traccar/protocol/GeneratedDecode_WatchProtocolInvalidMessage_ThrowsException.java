package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecode_WatchProtocolInvalidMessage_ThrowsException {

    @Test
    public void decode_WatchProtocolInvalidMessage_ThrowsException() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder("WatchProtocol");
        protocol.setValidMessage(false);

        // Act and Assert
        assertThrows(Exception.class, () -> decoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), ""));
    }

}