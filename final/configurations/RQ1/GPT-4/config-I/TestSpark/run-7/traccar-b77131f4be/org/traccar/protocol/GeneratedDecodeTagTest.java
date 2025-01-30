package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class GeneratedDecodeTagTest {

    @Test
    public void decodeTagTest() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes(new byte[]{0x01, 0x02, 0x03, 0x04});
        Position position = new Position();

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("test-protocol"));
        decoder.decodeTag(position, buf, 0x01);

        int result = position.getInteger(Position.KEY_VERSION_HW);
        assertEquals(1, result);
    }

}