package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedGalileoProtocolDecoderCreationTest {

    @Test
    public void galileoProtocolDecoderCreationTest() {
        Protocol protocol = mock(Protocol.class);
        assertNotNull(new GalileoProtocolDecoder(protocol));
    }

}