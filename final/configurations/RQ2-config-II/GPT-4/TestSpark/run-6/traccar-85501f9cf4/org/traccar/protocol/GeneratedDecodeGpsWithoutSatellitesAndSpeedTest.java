package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithoutSatellitesAndSpeedTest {

    @Test
    public void decodeGpsWithoutSatellitesAndSpeedTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeInt(10);

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, TimeZone.getDefault());

        assertEquals(false, result);
    }

}