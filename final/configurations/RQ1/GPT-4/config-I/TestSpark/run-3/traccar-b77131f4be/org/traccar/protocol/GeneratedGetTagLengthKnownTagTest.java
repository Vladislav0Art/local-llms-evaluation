package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.awaitility.Awaitility;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedGetTagLengthKnownTagTest {

    @Test
    public void getTagLengthKnownTagTest() {
        int tag = 0x01;
        Assert.assertEquals(1, GalileoProtocolDecoder.getTagLength(tag));
    }

}