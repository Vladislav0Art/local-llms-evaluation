package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.TimeZone;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsNoOptionsTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());

    @Test
    public void decodeGpsNoOptionsTest() throws Exception {
        ByteBuf buf = Unpooled.wrappedBuffer("testData".getBytes(StandardCharsets.UTF_8));
        Position position = new Position();

        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, TimeZone.getDefault()));
    }

}