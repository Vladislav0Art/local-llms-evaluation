package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeGpsWithLengthSatellitesTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());

    @Test
    public void decodeGpsWithLengthSatellitesTest() {
        ByteBuf buf = Unpooled.copiedBuffer("69dc035bf0".getBytes(StandardCharsets.UTF_8));
        Position position = new Position();
        Assert.assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, false, TimeZone.getDefault()));
    }

}