package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedDecode_WatchProtocolIndexIsInvalid_ReturnsException {

    @Test
    public void decode_WatchProtocolIndexIsInvalid_ReturnsException() throws Exception {
        // Arrange
        Protocol protocol = Protocol.WATCH;
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Act and Assert
        assertThrows(Exception.class, () -> decoder.decode(new byte[0], 0, null));
    }
}

}