package org.traccar.protocol;

import org.junit.Test;
import org.traccar.DatabaseManager;
import org.traccar.GlobalContext;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.*;

public class GeneratedDecodeTestBloodPressure {

    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch", 0, false, false, null));

    @Test
    public void decodeTestBloodPressure() throws Exception {
        if (!GlobalContext.install(new DatabaseManager())) {
            assertNull(decoder.decode(null, null, "10*123456789012345*0009*BPHRT,80,60,80"));
        }
    }

}