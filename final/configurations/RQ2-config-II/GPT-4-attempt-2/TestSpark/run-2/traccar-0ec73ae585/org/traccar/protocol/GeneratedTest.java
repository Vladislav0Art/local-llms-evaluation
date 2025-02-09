package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import io.netty.channel.embedded.EmbeddedChannel;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    private static final WatchProtocolDecoder DECODER = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void getManufacturerTest() {
        Assert.assertEquals("Manufacturer is incorrect", "Watch", DECODER.getManufacturer());
    }

    @Test
    public void getHasIndexTest() {
        Assert.assertEquals("HasIndex is incorrect", true, DECODER.getHasIndex());
    }

    @Test
    public void decodeValidMsgTest() throws Exception {
        EmbeddedChannel channel = new EmbeddedChannel(DECODER);
        DECODER.decode(channel, null, "[CS*12345678*0002*LK]");
        Position position = (Position) channel.readOutbound();
        assertNotNull(position);
    }

    @Test
    public void decodeInvalidMsgTest() throws Exception {
        DECODER.decode(null, null, "[CS*invalid*0002*LK]");
    }

}