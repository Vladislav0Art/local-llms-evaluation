package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.util.TimeZone;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.model.Position;
import org.traccar.Protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithAllParametersTest {

    @Test
    public void decodeGpsWithAllParametersTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer(new byte[]{0, 1, 2, 3, 4});
        TimeZone timeZone = TimeZone.getDefault();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, timeZone);
        assertTrue(result);
    }

}