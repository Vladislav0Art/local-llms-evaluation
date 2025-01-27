package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchInvalidMessage_ThrowsException {

    @Test
    public void decode_WatchInvalidMessage_ThrowsException() throws Exception {
        // Arrange
        Object msg = Parser.build("Invalid watch message", WatchProtocolDecoder.class);

        // Act and Assert
        assertThrows(Exception.class, () -> new WatchProtocolDecoder(Protocol.WATCH).decode(null, null, msg));
    }

}