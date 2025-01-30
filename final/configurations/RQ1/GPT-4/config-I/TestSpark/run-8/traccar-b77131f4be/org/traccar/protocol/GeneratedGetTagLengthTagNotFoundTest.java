package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetTagLengthTagNotFoundTest {

    @Mock
    private Channel channel;

    @Test
    public void getTagLengthTagNotFoundTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Test"));
        decoder.getTagLength(0xFF);
    }

}