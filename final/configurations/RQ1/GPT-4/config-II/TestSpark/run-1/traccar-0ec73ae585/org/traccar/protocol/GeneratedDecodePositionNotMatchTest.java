package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedDecodePositionNotMatchTest {

    @Test
    public void decodePositionNotMatchTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());
        assertNull(decoder.decodePosition(
                new StandardDeviceSession(null, null, "testDevice", null, null, null),
                null));
    }

}