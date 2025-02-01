package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Model.Protocol;
import org.traccar.Model.Position;

public class GeneratedWatchProtocolDecoderConstructorTest {

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("protocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("protocol", decoder.getProtocolName());
    }

}