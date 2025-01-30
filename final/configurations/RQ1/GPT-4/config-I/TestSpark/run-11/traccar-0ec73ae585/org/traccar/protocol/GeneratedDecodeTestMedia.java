package org.traccar.protocol;

import org.junit.Test;
import org.traccar.DatabaseManager;
import org.traccar.GlobalContext;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.*;

public class GeneratedDecodeTestMedia {

    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch", 0, false, false, null));

    @Test
    public void decodeTestMedia() throws Exception {
        assertNull(decoder.decode(null, null, "07*89860187800005643017*0012*TK,AMR,0001,5,3,200L,End_JX"));
    }

}