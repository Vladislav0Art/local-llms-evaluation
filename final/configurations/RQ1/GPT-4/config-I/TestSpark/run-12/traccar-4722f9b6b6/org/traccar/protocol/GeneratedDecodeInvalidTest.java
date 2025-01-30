package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedDecodeInvalidTest {

    @Test
    public void decodeInvalidTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(null);

        Object decoded = decoder.decode(channel, null, Unpooled.copiedBuffer("[invalid]", StandardCharsets.US_ASCII));

        Assert.assertNull(decoded);
    }

}