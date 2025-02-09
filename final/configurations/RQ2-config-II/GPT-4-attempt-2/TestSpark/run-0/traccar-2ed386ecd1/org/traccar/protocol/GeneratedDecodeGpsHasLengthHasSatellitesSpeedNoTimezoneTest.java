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

public class GeneratedDecodeGpsHasLengthHasSatellitesSpeedNoTimezoneTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));

    @Test
    public void decodeGpsHasLengthHasSatellitesSpeedNoTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0000000000000000", StandardCharsets.UTF_8);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, null);
        Assert.assertEquals(true, result);
    }

}