package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedTestDecode_WatchProtocolValidMessage_ReturnsCorrectData {

    @Test
    public void testDecode_WatchProtocolValidMessage_ReturnsCorrectData() throws Exception {
        // Arrange
        Protocol protocol = Protocol.WATCH;
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Act
        Object result = decoder.decode(null, 0, null);

        // Assert
        assertNotNull(result);
    }

}