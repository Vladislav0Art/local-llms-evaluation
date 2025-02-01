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

public class GeneratedGetTagLengthTest {

    public GalileoProtocolDecoderTest() {
        super(new GalileoProtocolDecoder(new ProtocolTest()));
    }

    @Test
    public void getTagLengthTest() {
        int tag = 0x64;
        int expectedResult = 3;
        int actualResult = GalileoProtocolDecoder.getTagLength(tag);
        assertEquals(expectedResult, actualResult);
    }

}