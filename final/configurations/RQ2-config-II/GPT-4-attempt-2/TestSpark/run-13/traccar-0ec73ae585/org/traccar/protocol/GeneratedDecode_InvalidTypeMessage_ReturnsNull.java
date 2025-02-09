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
public class GeneratedDecode_InvalidTypeMessage_ReturnsNull {

    @Mock
    private Channel channel;
    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decode_InvalidTypeMessage_ReturnsNull() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Object result = decoder.decode(channel, remoteAddress, new Object());
        assertEquals(null, result);
    }

}