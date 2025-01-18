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

public class GeneratedTest {

    @Test
    public void decodeGpsNoLengthNoSatellitesTest() {
        // Arrange
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("123456", StandardCharsets.UTF_8);
        TimeZone timeZone = TimeZone.getDefault();

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, timeZone);

        // Assert
        assertFalse(result);
    }

    @Test
    public void decodeGpsWithLengthNoSatellitesTest() {
        // Arrange
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("123456", StandardCharsets.UTF_8);
        TimeZone timeZone = TimeZone.getDefault();

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, false, false, timeZone);

        // Assert
        assertFalse(result);
    }

    @Test
    public void decodeGpsWithLengthAndSatellitesTest() {
        // Arrange
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("123456", StandardCharsets.UTF_8);
        TimeZone timeZone = TimeZone.getDefault();

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, false, timeZone);

        // Assert
        assertFalse(result);
    }

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

    @Test
    public void decodeTest() throws Exception {
        // Arrange
        byte[] bytes = new byte[]{(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
        Channel channel = Mockito.mock(Channel.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));

        // Act
        Object result = decoder.decode(channel, null, Unpooled.wrappedBuffer(bytes));

        // Assert
        assertEquals(null, result);
    }

}