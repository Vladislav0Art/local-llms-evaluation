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

public class GeneratedTest {

    @Test
    public void decodeValidDataTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        String hex = "01020304"; //replace with valid data
        Object msg = Unpooled.copiedBuffer(hex, StandardCharsets.UTF_8);
        decoder.decode(channel, null, msg);
    }

    @Test
    public void decodeInvalidDataTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        String hex = "invalid";
        Object msg = Unpooled.copiedBuffer(hex, StandardCharsets.UTF_8);
        decoder.decode(channel, null, msg);
    }

    @Test
    public void decodeNullMsgTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        decoder.decode(channel, null, null);
    }

    @Test
    public void decodeNoDataTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Object msg = Unpooled.EMPTY_BUFFER;
        assertNull(decoder.decode(channel, null, msg));
    }

    @Test
    public void protocolConstructionTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        assertNotNull(decoder);
    }

}