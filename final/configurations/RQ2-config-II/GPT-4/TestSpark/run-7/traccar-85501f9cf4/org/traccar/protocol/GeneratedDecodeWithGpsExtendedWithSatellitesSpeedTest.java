package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithGpsExtendedWithSatellitesSpeedTest {

    @Mock
    Protocol protocol;

    @Test
    public void decodeWithGpsExtendedWithSatellitesSpeedTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("12AB345544", StandardCharsets.UTF_8);
        boolean result = decoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());
        assertTrue(result);
    }

}