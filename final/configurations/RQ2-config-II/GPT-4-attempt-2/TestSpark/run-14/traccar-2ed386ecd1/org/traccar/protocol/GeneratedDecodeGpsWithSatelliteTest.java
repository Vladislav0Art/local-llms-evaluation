package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.NetworkMessage;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class GeneratedDecodeGpsWithSatelliteTest {

    @Test
    public void decodeGpsWithSatelliteTest() {
        ByteBuf buffer = Unpooled.copiedBuffer("0A040100af05da50", StandardCharsets.UTF_8);
        assertTrue(Gt06ProtocolDecoder.decodeGps(new Position(), buffer, true, true, false, TimeZone.getDefault()));
    }

}