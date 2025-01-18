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

public class GeneratedDecodeNullMsgTest {

    @Test
    public void decodeNullMsgTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        decoder.decode(channel, null, null);
    }

}