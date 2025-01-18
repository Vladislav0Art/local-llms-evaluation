package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedDecodeGpsWithLengthSatellitesAndSpeedTest {

    @Test
    public void decodeGpsWithLengthSatellitesAndSpeedTest() {
        // Arrange
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("123456", StandardCharsets.UTF_8);
        TimeZone timeZone = TimeZone.getDefault();

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, timeZone);

        // Assert
        assertFalse(result);
    }

}