package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithIndexTest {

    @Mock
    private Protocol protocol;

    @Mock
    Channel channel;

    @Test
    public void decodeWithIndexTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        SocketAddress remoteAddress = new InetSocketAddress(5555);
        when(channel.remoteAddress()).thenReturn(remoteAddress);
        decoder.decode(channel, remoteAddress, Unpooled.copiedBuffer("[3G*1234567890*0009*UD,240615,A,4721.0296,N,00825.2356,E,0.00,61.7,585.0", StandardCharsets.US_ASCII));
        assertTrue(decoder.getHasIndex());
    }

}