package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

public class GeneratedGetTagLengthKnownTagTest {

    @Test
    public void getTagLengthKnownTagTest() {
        Assert.assertEquals(1, GalileoProtocolDecoder.getTagLength(0x01));
        Assert.assertEquals(2, GalileoProtocolDecoder.getTagLength(0x04));
        Assert.assertEquals(3, GalileoProtocolDecoder.getTagLength(0x63));
        Assert.assertEquals(4, GalileoProtocolDecoder.getTagLength(0x20));
        Assert.assertEquals(7, GalileoProtocolDecoder.getTagLength(0x5b));
    }

}