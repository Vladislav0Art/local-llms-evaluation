package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithoutHasLengthTest {

    @Mock
    Protocol protocol;

    @Test
    public void decodeGpsWithoutHasLengthTest() {
        ByteBuf buffer = Unpooled.copiedBuffer("010101", StandardCharsets.UTF_8);
        Position position = new Position();

        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buffer, false, TimeZone.getDefault()));
        assertTrue(buffer.isReadable());
    }

}