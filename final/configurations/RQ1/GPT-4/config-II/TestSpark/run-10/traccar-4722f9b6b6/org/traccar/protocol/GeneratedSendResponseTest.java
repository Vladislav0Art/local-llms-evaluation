package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;

public class GeneratedSendResponseTest {

    @Test
    public void sendResponseTest() {
        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(null);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol(""));
        decoder.sendResponse(channel, "1", "1", "1");
        verify(channel, times(1)).writeAndFlush(anyObject());
    }

}