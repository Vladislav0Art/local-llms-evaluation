package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

public class GeneratedTest {

    @Test
    public void testDecodeWithoutIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder();
        Assert.assertFalse(decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder();
        Assert.assertEquals("Watch", decoder.getManufacturer());
    }

    @Test
    public void testDecode() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder();
        Object result = decoder.decode(null, null, null);
        Assert.assertNull(result);
    }

}