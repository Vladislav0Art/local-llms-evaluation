package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.TimeZone;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithLengthNoTimezoneTest {


    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);

    @Test
    public void decodeGpsWithLengthNoTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer("location".getBytes(StandardCharsets.UTF_8));
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, null));
    }

}