package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.ByteBuffer;

import org.traccar.model.Position;

import java.util.TimeZone;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithoutLengthTest {

    @Test
    public void decodeGpsWithoutLengthTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        TimeZone timeZone = TimeZone.getDefault();

        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, timeZone));
    }

}