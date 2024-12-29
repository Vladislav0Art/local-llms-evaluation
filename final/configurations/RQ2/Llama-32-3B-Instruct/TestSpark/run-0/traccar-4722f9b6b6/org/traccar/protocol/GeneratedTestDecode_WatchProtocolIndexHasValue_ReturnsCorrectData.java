package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedTestDecode_WatchProtocolIndexHasValue_ReturnsCorrectData {

    @Test
    public void testDecode_WatchProtocolIndexHasValue_ReturnsCorrectData() throws Exception {
        // Arrange
        Protocol protocol = Protocol.WATCH;
        byte[] data = {1, 2, 3};
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Act
        Object result = decoder.decode(data, 0, null);

        // Assert
        assertEquals(3, ((byte[]) result)[0]);
    }

}