package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.net.InetSocketAddress;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithSatellitesAndSpeedAndDefaultTimezoneTest {

    @Mock
    private Protocol protocol;

    @Test
    public void decodeGpsWithSatellitesAndSpeedAndDefaultTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0);
        boolean hasLength = true;
        boolean hasSatellites = true;
        boolean hasSpeed = true;

        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, hasSatellites, hasSpeed, TimeZone.getDefault()));
    }

}