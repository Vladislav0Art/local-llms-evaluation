package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

public class GeneratedDecodeTagOtherValidTagsTest {

    @Test
    public void DecodeTagOtherValidTagsTest() {
        ByteBuf buf = Unpooled.buffer(16);
        buf.writeInt(2);
        buf.writeShort(1);
        buf.writeByte(1);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("protocol"));
        Position position = new Position("protocol");

        decoder.decodeTagOther(position, buf, 0x01);
        Assert.assertEquals(1, position.getAttributes().size());
    }

}