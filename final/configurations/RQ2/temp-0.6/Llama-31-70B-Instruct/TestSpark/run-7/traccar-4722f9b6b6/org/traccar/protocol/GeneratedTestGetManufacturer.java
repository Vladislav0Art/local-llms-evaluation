package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder();
        Assert.assertEquals("Watch", decoder.getManufacturer());
    }

}