package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeNullPointerExceptionTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeNullPointerExceptionTest() {
        Protocol protocol = new Protocol("watchProtocolTest", 0);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        try {
            decoder.decode(channel, remoteAddress, null);
            fail("Exception should be thrown");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

}