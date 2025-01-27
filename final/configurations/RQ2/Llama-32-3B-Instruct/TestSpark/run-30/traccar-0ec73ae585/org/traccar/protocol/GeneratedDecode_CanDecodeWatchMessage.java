package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.WatchProtocolEncoder;
import org.traccar.model.Position;
import org.traccar.helper.Parser;

public class GeneratedDecode_CanDecodeWatchMessage {

    @Test
    public void decode_CanDecodeWatchMessage() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Position position = new Position(50.0, -122.0, 100, UnitsConverter.KILOMETERS_TO_MILES);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(outContent);
        decoder.decode(null, null, position);
        assertEquals(position.toString(), outContent.toString());
        System.setOut(originalOut);
    }

}