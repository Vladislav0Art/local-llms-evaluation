package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeGpsWithParametersTest {

    @Test
    public void decodeGpsWithParametersTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        Position position = new Position("gt06");
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes("890123456789012345".getBytes(StandardCharsets.ISO_8859_1));
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());
        assertTrue("Expected true but was false", result);
    }

}