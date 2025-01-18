package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.nio.charset.StandardCharsets;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedDecodeEmptyMsgTest {

    @Test
    public void decodeEmptyMsgTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        Protocol protocol = new Protocol("galileo") {
        };
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Object msg = Unpooled.copiedBuffer("", StandardCharsets.UTF_8);
        decoder.decode(channel, null, msg);
    }

}