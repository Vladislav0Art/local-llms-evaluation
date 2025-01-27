package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.WatchProtocolEncoder;
import org.traccar.model.Position;
import org.traccar.helper.Parser;

public class GeneratedTest {

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

    @Test
    public void decode_CanDecodeWatchWithInvalidFormat() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        byte[] invalidData = new byte[0];
        Position position = null;
        try {
            decoder.decode(null, null, invalidData);
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void decode_MatchesProtocol() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Position position = new Position(50.0, -122.0, 100, UnitsConverter.KILOMETERS_TO_MILES);
        NetworkMessage message = new NetworkMessage(position, "Watch");
        byte[] expectedData = Parser.encode(message);
        assertEquals(expectedData, decoder.decode(null, null, message));
    }

    @Test
    public void decode_MatchesParser() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Position position = new Position(50.0, -122.0, 100, UnitsConverter.KILOMETERS_TO_MILES);
        NetworkMessage message = new NetworkMessage(position, "Watch");
        WatchProtocolEncoder encoder = new WatchProtocolEncoder();
        byte[] expectedData = encoder.encode(message);
        assertEquals(expectedData, decoder.decode(null, null, message));
    }

    @Test
    public void getHasIndex_ReturnsFalse() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturer_ReturnsCorrectValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertEquals("Watch", decoder.getManufacturer());
    }

}