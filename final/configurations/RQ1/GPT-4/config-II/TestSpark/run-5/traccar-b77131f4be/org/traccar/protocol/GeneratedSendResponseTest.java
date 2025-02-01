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

public class GeneratedSendResponseTest {

    @Test
    public void sendResponseTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gl200"));
        Channel channel = mock(Channel.class, RETURNS_DEEP_STUBS);
        decoder.sendResponse(channel, 0xFF, 0xFFFF);
        verify(channel, times(1)).writeAndFlush(any());
    }

}