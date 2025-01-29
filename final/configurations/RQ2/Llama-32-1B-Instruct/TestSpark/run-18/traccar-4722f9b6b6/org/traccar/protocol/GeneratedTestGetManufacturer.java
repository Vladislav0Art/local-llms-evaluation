package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        String manufacturer = decoder.getManufacturer();
        assertTrue(!manufacturer.isEmpty());
        assertFalse(manufacturer.equals("Unknown"));
    }

}