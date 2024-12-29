package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedDecode_WatchProtocolInvalidMessage_ThrowsException {

    @Test
    public void decode_WatchProtocolInvalidMessage_ThrowsException() throws Exception {
        // Arrange
        Protocol protocol = Protocol.WATCH;
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Act and Assert
        assertThrows(Exception.class, () -> decoder.decode(null, null, null));
    }

}