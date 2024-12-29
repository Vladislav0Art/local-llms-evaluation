package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedDecode_WatchProtocolIndexHasValue_ReturnsCorrectData {

    @Test
    public void decode_WatchProtocolIndexHasValue_ReturnsCorrectData() throws Exception {
        // Arrange
        Protocol protocol = Protocol.WATCH;
        byte[] data = {1, 2, 3};
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Act
        byte[] result = new byte[0];
        decoder.decode(data, 0, result);

        // Assert
        assertEquals(3, result.length);
    }

}