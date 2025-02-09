package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import io.netty.channel.embedded.EmbeddedChannel;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.assertNotNull;

public class GeneratedDecodeInvalidMsgTest {

    private static final WatchProtocolDecoder DECODER = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void decodeInvalidMsgTest() throws Exception {
        DECODER.decode(null, null, "[CS*invalid*0002*LK]");
    }

}