package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketAddress;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.session.Session;
import org.traccar.ProtocolDecoder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;

import org.traccar.model.Position;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeMultipleFramesTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress socketAddress;

    @Test
    public void decodeMultipleFramesTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNotNull(decoder.decode(null, null, Unpooled.copiedBuffer("[3G*123456789012345*0009*UD,161119232304,V,2558.2082,N,8026.8894,W,0.00,70.8,96.8,7,31,96,508,0,01000000Aa00,3,2,2,0,2,Internet_1CC1DE216208,-77]", StandardCharsets.US_ASCII)));
    }

}