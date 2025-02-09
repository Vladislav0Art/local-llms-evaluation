package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeWithInvalidMessageTest {

    @Test
    public void decodeWithInvalidMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo"));
        EmbeddedChannel channel = new EmbeddedChannel(decoder);

        channel.writeInbound(Unpooled.copiedBuffer("?invalid,message?", StandardCharsets.US_ASCII));
    }

}