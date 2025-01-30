package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.protocol.Protocol;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedGetTagLengthPositiveTest {

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo"));

    @Test
    public void getTagLengthPositiveTest() {
        int tagLength = GalileoProtocolDecoder.getTagLength(0x01);
        assertEquals(1, tagLength);
    }

}