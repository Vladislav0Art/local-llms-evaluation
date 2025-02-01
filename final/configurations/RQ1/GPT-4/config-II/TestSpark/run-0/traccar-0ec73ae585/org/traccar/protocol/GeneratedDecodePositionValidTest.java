package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Model.Protocol;
import org.traccar.Model.Position;

public class GeneratedDecodePositionValidTest {

    @Test
    public void decodePositionValidTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("protocol"));
        DeviceSession deviceSession = new DeviceSession(1, "abc", "def");
        String data = "010101010101,A,-1.0,N,-1.0,E,1.0,1.0,1.0,1,1,1,1,1,1";
        Position position = decoder.decodePosition(deviceSession, data);
        assertNotNull(position);
        assertEquals(true, position.getValid());
    }

}