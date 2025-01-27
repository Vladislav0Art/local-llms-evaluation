package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.WatchProtocolEncoder;
import org.traccar.model.Position;
import org.traccar.helper.Parser;

public class GeneratedDecode_MatchesParser {

    @Test
    public void decode_MatchesParser() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Position position = new Position(50.0, -122.0, 100, UnitsConverter.KILOMETERS_TO_MILES);
        NetworkMessage message = new NetworkMessage(position, "Watch");
        WatchProtocolEncoder encoder = new WatchProtocolEncoder();
        byte[] expectedData = encoder.encode(message);
        assertEquals(expectedData, decoder.decode(null, null, message));
    }

}