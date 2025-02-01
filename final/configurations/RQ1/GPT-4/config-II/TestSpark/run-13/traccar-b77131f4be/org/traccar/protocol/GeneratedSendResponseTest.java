package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSendResponseTest {

    @Test
    public void sendResponseTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);
        Channel channel = Mockito.mock(Channel.class);
        decoder.sendResponse(channel, 1, 1);
        verify(channel, times(1)).writeAndFlush(any());
    }

}