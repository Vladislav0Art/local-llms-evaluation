package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoderTest;
import org.traccar.ProtocolTest;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

public class GeneratedSendResponseTest {

    public GalileoProtocolDecoderTest() {
        super(new GalileoProtocolDecoder(new ProtocolTest()));
    }

    @Test
    public void sendResponseTest() {
        Channel channel = Mockito.mock(Channel.class);
        ArgumentCaptor<ByteBuf> captor = ArgumentCaptor.forClass(ByteBuf.class);
        int header = 0x33;
        int checkSum = 25;

        decoder.sendResponse(channel, header, checkSum);
        verify(channel).writeAndFlush(captor.capture());
        ByteBuf buf = captor.getValue();
        assertEquals(header, buf.readByte());
        assertEquals(checkSum, buf.readShortLE());
    }

}