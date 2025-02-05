package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithExceptionTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeWithExceptionTest() throws Exception {
        String invalidMessage = "not a valid message";
        byte[] message = invalidMessage.getBytes(StandardCharsets.US_ASCII);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        decoder.decode(channel, remoteAddress, Unpooled.copiedBuffer(message));
    }

}