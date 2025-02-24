package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

public class GeneratedGetManufacturerTest {

    private WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void getManufacturerTest() {
        Assert.assertNotNull(watchProtocolDecoder.getManufacturer());
    }

}