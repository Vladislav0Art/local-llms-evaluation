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
public class GeneratedDecodeMessageWithValidDataTest {

    @Mock
    private Protocol protocol;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Channel channel;

    @Test
    public void decodeMessageWithValidDataTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        String message = "validTestData123";

        Position actual = (Position) decoder.decode(channel, remoteAddress, Unpooled.wrappedBuffer(message.getBytes()));

        assertNotNull(actual);
        assertEquals(actual.getLatitude(), 0.0, 0.001);
        assertEquals(actual.getLongitude(), 0.0, 0.001);
    }

}