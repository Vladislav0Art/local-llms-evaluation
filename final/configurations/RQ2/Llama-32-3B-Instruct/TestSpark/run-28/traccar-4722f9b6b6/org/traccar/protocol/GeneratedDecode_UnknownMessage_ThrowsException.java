package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_UnknownMessage_ThrowsException {

    @Test
    public void decode_UnknownMessage_ThrowsException() throws Exception {
        // Arrange
        Object msg = Parser.build("Unknown message", WatchProtocolDecoder.class);

        // Act and Assert
        assertThrows(Exception.class, () -> new WatchProtocolDecoder(Protocol.WATCH).decode(null, null, msg));
    }

}