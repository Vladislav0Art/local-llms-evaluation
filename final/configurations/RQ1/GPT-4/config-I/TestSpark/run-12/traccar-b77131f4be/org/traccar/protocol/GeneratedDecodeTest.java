package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01); // Header
        buf.writeShortLE(0); // Length

        List<Position> positions = (List<Position>) decoder.decode(mock(Channel.class), null, buf);
        assertNull(positions);
    }

}