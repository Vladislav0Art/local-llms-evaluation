package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Model.Protocol;
import org.traccar.Model.Position;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("protocol"));
        decoder.setHasIndex(true);
        assertEquals(true, decoder.getHasIndex());
    }

}