package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import io.netty.channel.embedded.EmbeddedChannel;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.assertNotNull;

public class GeneratedGetHasIndexTest {

    private static final WatchProtocolDecoder DECODER = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void getHasIndexTest() {
        Assert.assertEquals("HasIndex is incorrect", true, DECODER.getHasIndex());
    }

}