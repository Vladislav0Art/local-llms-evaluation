package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsNoLengthTest {

    @Mock
    private Channel channel;

    @Test
    public void decodeGpsNoLengthTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("someTestBytes", StandardCharsets.UTF_8);
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault()));
    }

}