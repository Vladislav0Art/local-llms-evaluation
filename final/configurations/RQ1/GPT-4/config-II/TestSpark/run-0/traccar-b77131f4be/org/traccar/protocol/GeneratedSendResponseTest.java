package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

public class GeneratedSendResponseTest {

    @Test
    public void SendResponseTest() {
        Channel channel = Mockito.mock(Channel.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("protocol"));
        decoder.sendResponse(channel, 0x01, 100);
        Mockito.verify(channel).writeAndFlush(Mockito.any());
    }

}