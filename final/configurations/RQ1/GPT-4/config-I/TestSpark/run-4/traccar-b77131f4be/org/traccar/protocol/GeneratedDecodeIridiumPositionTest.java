package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeIridiumPositionTest {

    @Test
    public void decodeIridiumPositionTest() throws Exception {
        Protocol protocol = new Protocol("TEST");
        Channel channel = mock(Channel.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01);
        buf.writeBytes(new byte[2]);
        buf.writeBytes(new byte[3]);
        buf.writeIntLE(0);
        buf.writeBytes("123456789011111".getBytes(StandardCharsets.US_ASCII));
        buf.writeByte(0);
        buf.writeBytes(new byte[4]);
        buf.writeIntLE(0);
        buf.writeBytes(new byte[23]);
        buf.writeBytes(new byte[3]);
        buf.writeBytes(new byte[10]);

        Position position = decoder.decodeIridiumPosition(channel, null, buf);
        assertNull(position);
    }

}