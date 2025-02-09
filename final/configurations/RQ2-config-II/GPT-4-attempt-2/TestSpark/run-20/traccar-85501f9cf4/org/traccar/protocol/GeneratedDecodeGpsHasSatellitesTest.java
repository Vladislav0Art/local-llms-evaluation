package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.nio.ByteBuffer;

import org.traccar.model.Position;

import java.util.Date;

public class GeneratedDecodeGpsHasSatellitesTest {

    @Test
    public void decodeGpsHasSatellitesTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(
                position,
                Unpooled.wrappedBuffer(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}),
                true,
                true,
                true,
                TimeZone.getDefault()
        );
        Assert.assertTrue(result);
    }

}