package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetTagLengthTest {

    @Test
    public void getTagLengthTest() {
        assertEquals(1, GalileoProtocolDecoder.getTagLength(0x01));
        assertEquals(2, GalileoProtocolDecoder.getTagLength(0x04));
        assertEquals(3, GalileoProtocolDecoder.getTagLength(0x63));
        assertEquals(4, GalileoProtocolDecoder.getTagLength(0x20));
    }

}