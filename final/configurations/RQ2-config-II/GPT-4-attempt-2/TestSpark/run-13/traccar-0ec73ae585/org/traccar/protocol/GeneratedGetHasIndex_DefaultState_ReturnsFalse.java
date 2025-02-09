package org.traccar.protocol;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndex_DefaultState_ReturnsFalse {

    @Mock
    private Channel channel;
    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void getHasIndex_DefaultState_ReturnsFalse() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertEquals(false, decoder.getHasIndex());
    }

}