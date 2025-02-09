package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeGpsWithLengthAndTimezoneTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("GT06"));

    @Test
    public void decodeGpsWithLengthAndTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer().writeBytes("test data".getBytes(StandardCharsets.UTF_8));
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getTimeZone(ZoneOffset.UTC));
        assertTrue(result);
    }

}