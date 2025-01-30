package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;

import static org.junit.Assert.assertEquals;

public class GeneratedGetTagLengthTest {

    @Test
    public void getTagLengthTest() {
        int tagLength = GalileoProtocolDecoder.getTagLength(129);
        assertEquals(3, tagLength);
    }

}