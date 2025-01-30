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
public class GeneratedDecodeInvalidFrameTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress socketAddress;

    @Test
    public void decodeInvalidFrameTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.decode(null, null, Unpooled.copiedBuffer("[3G*123456789012345*000F*LK,,,]", StandardCharsets.US_ASCII)));
    }

}