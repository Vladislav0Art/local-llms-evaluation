package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import io.netty.channel.embedded.EmbeddedChannel;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.assertNotNull;

public class GeneratedGetManufacturerTest {

    private static final WatchProtocolDecoder DECODER = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void getManufacturerTest() {
        Assert.assertEquals("Manufacturer is incorrect", "Watch", DECODER.getManufacturer());
    }

}