package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Model.Protocol;
import org.traccar.Model.Position;

public class GeneratedDecodePositionInvalidDataTest {

    @Test
    public void decodePositionInvalidDataTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("protocol"));
        DeviceSession deviceSession = new DeviceSession(1, "abc", "def");
        String data = "This is invalid";
        Position position = decoder.decodePosition(deviceSession, data);
        assertNull(position);
    }

}