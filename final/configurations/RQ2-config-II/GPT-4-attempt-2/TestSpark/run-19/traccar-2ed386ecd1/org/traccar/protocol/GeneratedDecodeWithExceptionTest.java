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
public class GeneratedDecodeWithExceptionTest {

    private static final Protocol PROTOCOL = new Protocol("gt06");

    @Test
    public void decodeWithExceptionTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(PROTOCOL);
        Channel channel = Mockito.mock(Channel.class);

        try {
            decoder.decode(channel, null, "non-buffer message");
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertTrue(e instanceof ClassCastException);
        }
    }

}