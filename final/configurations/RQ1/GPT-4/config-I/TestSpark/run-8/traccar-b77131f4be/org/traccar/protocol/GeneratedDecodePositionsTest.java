package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePositionsTest {

    @Mock
    private Channel channel;

    @Test
    public void decodePositionsTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Test"));
        String id = "GALILEO_DEVICE_ID";

        LinkedList<Position> result = new LinkedList<>();
        ByteBuf msg = Unpooled.buffer();
        msg.writeByte(0x01); // header
        msg.writeShortLE(23 + id.length()); // length
        msg.writeByte(0x03); // tag
        msg.writeCharSequence(id, StandardCharsets.US_ASCII); // device id
        msg.writeByte(0x10);
        msg.writeShortLE(1); // index
        msg.writeByte(0x30);
        msg.writeByte(0); // flags
        msg.writeIntLE(50000000); // latitude
        msg.writeIntLE(20000000); // longitude
        msg.writeByte(0x01);
        msg.writeByte(10); // data

        List<Position> positions = decoder.decodePositions(channel, null, msg);
        assertNotNull(positions);
        assertFalse(positions.isEmpty());
        assertEquals(1, positions.size());
    }

}