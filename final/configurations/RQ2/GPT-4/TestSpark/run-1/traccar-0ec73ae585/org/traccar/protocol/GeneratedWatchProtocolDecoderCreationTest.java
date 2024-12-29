package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import java.net.InetSocketAddress;

import static org.junit.Assert.*;

public class GeneratedWatchProtocolDecoderCreationTest {

    @Test
    public void WatchProtocolDecoderCreationTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder wpd = new WatchProtocolDecoder(protocol);
        assertNotNull(wpd);
    }

}