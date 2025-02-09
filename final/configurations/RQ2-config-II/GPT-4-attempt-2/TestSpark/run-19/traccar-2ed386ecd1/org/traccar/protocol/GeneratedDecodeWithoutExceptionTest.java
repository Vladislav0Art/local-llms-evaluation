package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithoutExceptionTest {

    private static final Protocol PROTOCOL = new Protocol("gt06");

    @Test
    public void decodeWithoutExceptionTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(PROTOCOL);
        Channel channel = Mockito.mock(Channel.class);

        assertNull(decoder.decode(channel, null, Unpooled.copiedBuffer("123456", StandardCharsets.UTF_8)));
    }

}