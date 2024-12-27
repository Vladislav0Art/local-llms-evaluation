package org.traccar.protocol;

import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;

import static org.junit.Assert.*;

import org.traccar.Protocol;

import static org.mockito.Mockito.*;

import org.traccar.protocol.Protocol;

import java.nio.channels.Channel;
import java.net.SocketAddress;

public class GeneratedDecodeGpsWithLengthAndTimeZoneTest {

    @Test
    public void decodeGpsWithLengthAndTimeZoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault()));
    }

}