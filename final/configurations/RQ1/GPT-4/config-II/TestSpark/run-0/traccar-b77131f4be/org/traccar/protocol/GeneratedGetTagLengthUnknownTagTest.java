package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

public class GeneratedGetTagLengthUnknownTagTest {

    @Test
    public void getTagLengthUnknownTagTest() {
        GalileoProtocolDecoder.getTagLength(0xFFFF);
    }

}