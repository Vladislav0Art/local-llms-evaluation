package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithLengthTest {

    @Mock
    Protocol protocol;

    @Mock
    SocketAddress remoteAddress;

    @Test
    public void decodeGpsWithLengthTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("Hello", StandardCharsets.UTF_8);
        TimeZone timeZone = TimeZone.getDefault();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, timeZone);
        assertTrue(result);
    }

}