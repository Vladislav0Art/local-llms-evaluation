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
public class GeneratedGetHasIndexTest {

    @Mock
    private Protocol protocol;

    @Mock
    Channel channel;

    @Test
    public void getHasIndexTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        SocketAddress remoteAddress = new InetSocketAddress(5555);
        decoder.decode(channel, remoteAddress, Unpooled.copiedBuffer("[3G*1234567890*0009*LK,51A]", StandardCharsets.US_ASCII));
        assertNotNull(decoder.getHasIndex());
    }

}