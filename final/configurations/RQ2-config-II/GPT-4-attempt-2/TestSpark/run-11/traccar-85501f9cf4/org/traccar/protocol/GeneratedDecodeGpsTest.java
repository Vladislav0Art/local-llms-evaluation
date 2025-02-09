package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;

@RunWith(JUnit4.class)
public class GeneratedDecodeGpsTest {

    @Test
    public void decodeGpsTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("Sample Byte Buffer", StandardCharsets.UTF_8);
        boolean hasLength = true;
        boolean hasSatellites = true;
        boolean hasSpeed = true;
        TimeZone timezone = TimeZone.getDefault();

        Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, timezone);
        Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, hasSatellites, hasSpeed, timezone);
    }

}