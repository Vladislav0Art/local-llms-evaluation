package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Test
    public void GalileoProtocolDecoderCreationTest() {
        new GalileoProtocolDecoder(protocol);
    }

    @Test
    public void decodeNullMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        decoder.decode(channel, null, null);
    }

    @Test
    public void decodeEmptyMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        decoder.decode(channel, null, Unpooled.copiedBuffer("", StandardCharsets.UTF_8));
    }

    @Test
    public void decodeValidLoginMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        String msg = "<login message according to the protocol>";
        decoder.decode(channel, null, Unpooled.copiedBuffer(msg, StandardCharsets.UTF_8));
        verify(channel).writeAndFlush(new NetworkMessage("<expected response>", null));
    }

    @Test
    public void decodeInvalidLoginMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        String msg = "<invalid login message>";
        decoder.decode(channel, null, Unpooled.copiedBuffer(msg, StandardCharsets.UTF_8));
        verify(channel).writeAndFlush(new NetworkMessage("<expected response>", null));
    }

}