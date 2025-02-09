package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeGpsSatellitesSpeedTest {

    @Test
    public void decodeGpsSatellitesSpeedTest() {
        ByteBuf buf = Unpooled.buffer();
        ByteBufUtil.writeAscii(buf, "$MGSV,GNGLL,3751.65,N,02436.38,E,225444.00,A,A,2*74");

        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());

        Assert.assertTrue(result);
        Assert.assertEquals(37.5165, position.getLatitude(), 0.0001);
        Assert.assertEquals(24.3638, position.getLongitude(), 0.0001);
        Assert.assertEquals(2, position.get("satellites"));
        Assert.assertEquals(0, position.getSpeed(), 0.1);
    }

}