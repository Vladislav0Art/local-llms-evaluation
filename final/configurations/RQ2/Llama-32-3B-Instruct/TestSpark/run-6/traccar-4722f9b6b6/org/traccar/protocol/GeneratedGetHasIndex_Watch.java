package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuffer;
import java.util.ArrayList;
import java.util.List;

public class GeneratedGetHasIndex_Watch {

    @Test
    public void getHasIndex_Watch() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        boolean result = decoder.getHasIndex();
        assertTrue(result);
    }

}