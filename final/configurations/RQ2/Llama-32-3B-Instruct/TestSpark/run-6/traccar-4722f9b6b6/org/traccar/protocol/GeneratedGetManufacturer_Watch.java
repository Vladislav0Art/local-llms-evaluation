package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuffer;
import java.util.ArrayList;
import java.util.List;

public class GeneratedGetManufacturer_Watch {

    @Test
    public void getManufacturer_Watch() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        String result = decoder.getManufacturer();
        assertEquals("Watch", result);
    }

}