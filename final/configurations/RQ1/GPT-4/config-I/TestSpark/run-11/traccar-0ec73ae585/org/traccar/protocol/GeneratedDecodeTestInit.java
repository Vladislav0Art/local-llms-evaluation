package org.traccar.protocol;

import org.junit.Test;
import org.traccar.DatabaseManager;
import org.traccar.GlobalContext;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.*;

public class GeneratedDecodeTestInit {

    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch", 0, false, false, null));

    @Test
    public void decodeTestInit() throws Exception {
        assertEquals(null, decoder.decode(null, null, "[CS*123456789012345*0002*LK]"));
        assertEquals(null, decoder.decode(null, null, "[CS*123456789012345*UD,230615,A,6000.0000,N,6000.0000,E,000.0,000,0.0,F,204,01,0C1F,3A64]"));
    }

}