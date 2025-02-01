package org.traccar.protocol;

import org.junit.Test;
import org.traccar.network.DataProtocol;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSendResponseTest {

    @Test
    public void sendResponseTest() {
        //Mock Channel
        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(new InetSocketAddress(50000));

        //Response Decoder
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());
        decoder.sendResponse(channel, 0x02, 0x0001);

        //Verify writeAndFlush has been called once on the channel
        verify(channel, times(1)).writeAndFlush(any(Object.class));
    }

}