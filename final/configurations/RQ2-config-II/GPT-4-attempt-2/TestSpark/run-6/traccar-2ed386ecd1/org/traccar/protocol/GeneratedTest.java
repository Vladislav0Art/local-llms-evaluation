package org.traccar.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        Protocol protocol = mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void decodeGpsTest() {
        Position position = new Position();
        ByteBuf buffer = Unpooled.copiedBuffer("\u00343422300123456015320050", StandardCharsets.ISO_8859_1);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buffer, true, timeZone);
        assertEquals(true, result);
    }

    @Test
    public void decodeGpsExtendedVersionTest() {
        Position position = new Position();
        ByteBuf buffer = Unpooled.copiedBuffer("\u00343422300123456015320050", StandardCharsets.ISO_8859_1);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buffer, true, true, true, timeZone);
        assertEquals(true, result);
    }

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(mock(Protocol.class));
        Channel channel = mock(Channel.class);
        Object msg = "watermark";

        Object result = decoder.decode(channel, null, msg);
        assertNotNull(result);
    }

}