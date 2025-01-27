package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.WatchProtocolEncoder;
import org.traccar.model.Position;
import org.traccar.helper.Parser;

public class GeneratedDecode_CanDecodeWatchWithInvalidFormat {

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

}