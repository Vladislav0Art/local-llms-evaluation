package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.awaitility.Awaitility;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedSendResponseChannelNotNullTest {

    @Test
    public void sendResponseChannelNotNullTest() {
        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(mock(SocketAddress.class));
        GalileoProtocolDecoder.sendResponse(channel, 1, 1);
        verify(channel).writeAndFlush(any());
    }

}