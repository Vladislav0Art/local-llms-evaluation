package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestGetManufacturer {

    private WatchProtocolDecoder watchProtocolDecoder;

    public void setUp() {
        watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());
    }

    @Test
    public void testGetManufacturer() {
        Assert.assertEquals("expectedManufacturer", watchProtocolDecoder.getManufacturer());
    }

}