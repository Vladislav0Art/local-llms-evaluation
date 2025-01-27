package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeWithPositionFromJson {

    @Test
    public void decodeWithPositionFromJson() throws Exception {
        String json = "{\"position\":{\"latitude\":1.0,\"longitude\":2.0,\"altitude\":3.0}}";
        Protocol protocol = createGalileoProtocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object decodedMessage = decoder.decode(null, null, json);
        assertTrue(decodedMessage instanceof Position);
    }

}