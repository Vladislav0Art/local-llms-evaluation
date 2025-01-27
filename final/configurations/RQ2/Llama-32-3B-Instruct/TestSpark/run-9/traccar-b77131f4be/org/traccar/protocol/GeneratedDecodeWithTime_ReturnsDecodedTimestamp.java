package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeWithTime_ReturnsDecodedTimestamp {

    @Test
    public void decodeWithTime_ReturnsDecodedTimestamp() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(GalileoProtocol.class);
        long timestamp = System.currentTimeMillis();
        Object decodedMessage = decoder.decode(null, null, "{\"time\":" + timestamp + "}");
        assertNotNull(decodedMessage);
    }

}