package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedDecodePositionInvalidDataTest {

    @Test
    public void decodePositionInvalidDataTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        Position result = decoder.decodePosition(new DeviceSession("testSession"), "invalidData");
        assertNull(result);
    }

}