package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.inOrder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    @Mock
    private Channel channel;

    @Test
    public void decodeTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Test"));
        String id = "GALILEO_DEVICE_ID";

        LinkedList<Position> result = new LinkedList<>();
        ByteBuf msg = Unpooled.buffer();
        msg.writeByte(0x01); // header
        msg.writeShortLE(23 + id.length()); // length
        msg.writeByte(0x03); // tag
        msg.writeCharSequence(id, StandardCharsets.US_ASCII); // device id
        msg.writeIntLE(1); // index
        List<Position> positions = (List<Position>) decoder.decode(channel, null, msg);
        assertNotNull(positions);
        assertFalse(positions.isEmpty());
        assertEquals(1, positions.size());
    }

}