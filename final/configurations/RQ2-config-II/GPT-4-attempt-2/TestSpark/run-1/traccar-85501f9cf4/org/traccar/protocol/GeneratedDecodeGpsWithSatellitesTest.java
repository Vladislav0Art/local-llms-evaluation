package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class GeneratedDecodeGpsWithSatellitesTest {

    @Test
    public void decodeGpsWithSatellitesTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer("some relevant data".getBytes(StandardCharsets.UTF_8));
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getTimeZone("UTC")));
    }

}