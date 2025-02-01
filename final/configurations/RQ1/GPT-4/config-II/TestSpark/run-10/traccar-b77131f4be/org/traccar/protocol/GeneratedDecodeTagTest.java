package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTagTest {

    @Test
    public void decodeTagTest() {
        Position position = new Position("galileo");
        ByteBuf buf = Unpooled.buffer(2);
        buf.writeShortLE(0x07);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());
        decoder.decodeTag(position, buf, 0x60);

        assertEquals("fuel0", position.getString("fuel0"));
        assertEquals(7, position.getDouble("fuel0"), 0.001);
    }

}