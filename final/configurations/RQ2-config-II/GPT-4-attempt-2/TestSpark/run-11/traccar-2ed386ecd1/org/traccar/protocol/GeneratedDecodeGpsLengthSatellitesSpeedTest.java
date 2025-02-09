package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.Charset;
import java.util.TimeZone;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsLengthSatellitesSpeedTest {

    @Mock
    private Protocol protocol;

    @Test
    public void decodeGpsLengthSatellitesSpeedTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0102030405060708090A", Charset.defaultCharset());
        TimeZone timezone = TimeZone.getDefault();

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, timezone);
        assertTrue(result);
    }

}