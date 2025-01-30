package org.traccar.protocol;

import org.junit.Test;
import org.traccar.DatabaseManager;
import org.traccar.GlobalContext;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.*;

public class GeneratedDecodeTestImg {

    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch", 0, false, false, null));

    @Test
    public void decodeTestImg() throws Exception {
        assertNull(decoder.decode(null, null, "10*4700189191*0009*IMG,200919,180801,02,(dta_start:02)"));
    }

}