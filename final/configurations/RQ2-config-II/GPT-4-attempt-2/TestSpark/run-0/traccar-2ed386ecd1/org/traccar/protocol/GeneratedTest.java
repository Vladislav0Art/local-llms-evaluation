package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));

    @Test
    public void decodeGpsHasLengthHasSatellitesSpeedTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0000000000000000", StandardCharsets.UTF_8);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());
        Assert.assertEquals(true, result);
    }

    @Test
    public void decodeGpsHasLengthSpeedTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0000000000000000", StandardCharsets.UTF_8);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, false, true, TimeZone.getDefault());
        Assert.assertEquals(true, result);
    }

    @Test
    public void decodeGpsHasLengthHasSatellitesTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0000000000000000", StandardCharsets.UTF_8);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, false, TimeZone.getDefault());
        Assert.assertEquals(true, result);
    }

    @Test
    public void decodeGpsHasLengthTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0000000000000000", StandardCharsets.UTF_8);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, false, false, TimeZone.getDefault());
        Assert.assertEquals(true, result);
    }

    @Test
    public void decodeGpsHasLengthHasSatellitesSpeedNoTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0000000000000000", StandardCharsets.UTF_8);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, null);
        Assert.assertEquals(true, result);
    }

    @Test
    public void decodeTest() throws Exception {
        Object result = decoder.decode(null, null, "0000000000000000");
        Assert.assertEquals(null, result);
    }

}