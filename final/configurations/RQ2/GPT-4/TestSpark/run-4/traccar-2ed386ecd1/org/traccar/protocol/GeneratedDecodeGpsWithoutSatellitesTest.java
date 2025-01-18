package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithoutSatellitesTest {

    @Test
    public void decodeGpsWithoutSatellitesTest() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes("170609080523.000,A,0343.7861,N,03959.9922,E,0.00,,;".getBytes(StandardCharsets.US_ASCII));
        Position position = new Position();
        Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, TimeZone.getTimeZone("GMT"));
        assertEquals("170609080523.000,A,0343.7861,N,03959.9922,E,0.00,,;", buf.toString(StandardCharsets.US_ASCII));
    }

}