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
public class GeneratedDecodeWithNonNullsTest {


    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);

    @Test
    public void decodeWithNonNullsTest() throws Exception {
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer("location".getBytes(StandardCharsets.UTF_8));
        assertEquals(decoder.decode(null, null, buf), Position.class);
    }

}