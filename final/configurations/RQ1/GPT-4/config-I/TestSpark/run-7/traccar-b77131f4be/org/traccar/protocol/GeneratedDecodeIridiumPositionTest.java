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

public class GeneratedDecodeIridiumPositionTest {

    @Test
    public void decodeIridiumPositionTest() {
        Channel channel = mock(Channel.class);
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes(new byte[]{0x01, 0x02, 0x33, 0x32,
                0x01, 0x01, 0x01, 0x01,
                0x01, 0x01, 0x01, 0x01,
                0x01, 0x01, 0x01, 0x01,
                0x01, 0x01, 0x01, 0x01,
                0x01, 0x01, 0x01, 0x01,
                0x01, 0x01, 0x01, 0x01});
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("test-protocol"));
        Position result = decoder.decodeIridiumPosition(channel, null, buf);

        assertNotNull(result);
    }

}