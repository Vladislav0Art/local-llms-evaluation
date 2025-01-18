package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.protocol.GalileoProtocolDecoder;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeNoDataTest {

    @Test
    public void decodeNoDataTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Object msg = Unpooled.EMPTY_BUFFER;
        assertNull(decoder.decode(channel, null, msg));
    }

}