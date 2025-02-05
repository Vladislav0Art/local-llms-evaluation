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
public class GeneratedDecodeGpsWithHasLengthTest {

    @Mock
    Protocol protocol;

    @Test
    public void decodeGpsWithHasLengthTest() {
        ByteBuf buffer = Unpooled.copiedBuffer("010101", StandardCharsets.UTF_8);
        Position position = new Position();

        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buffer, true, TimeZone.getDefault()));
        assertFalse(buffer.isReadable());
    }

}