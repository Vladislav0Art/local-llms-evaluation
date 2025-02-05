package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeMessageAndFailWithExceptionTest {

    @Mock
    private Protocol protocol;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Channel channel;

    @Test
    public void decodeMessageAndFailWithExceptionTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        String message = "garbledData";

        try {
            decoder.decode(channel, remoteAddress, Unpooled.wrappedBuffer(message.getBytes()));
        } catch (Exception e) {
            assertTrue(true);
        }
    }

}