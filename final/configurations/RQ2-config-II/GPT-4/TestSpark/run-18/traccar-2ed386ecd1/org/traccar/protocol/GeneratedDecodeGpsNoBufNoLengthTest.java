package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsNoBufNoLengthTest {

    @Test
    public void decodeGpsNoBufNoLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(""));
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("".getBytes(StandardCharsets.UTF_8));
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault());
        assertFalse(result);
    }

}