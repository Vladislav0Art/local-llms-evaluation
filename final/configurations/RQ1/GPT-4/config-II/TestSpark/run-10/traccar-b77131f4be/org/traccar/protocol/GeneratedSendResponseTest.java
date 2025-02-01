package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSendResponseTest {

    @Test
    public void sendResponseTest() {
        ByteBuf expectedReply = Unpooled.buffer(3);
        expectedReply.writeByte(0x07);
        expectedReply.writeShortLE(100);

        Channel channel = Mockito.mock(Channel.class);
        Mockito.when(channel.remoteAddress()).thenReturn(null);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());
        decoder.sendResponse(channel, 0x07, 100);

        verify(channel).writeAndFlush(new NetworkMessage(expectedReply, channel.remoteAddress()));
    }

}