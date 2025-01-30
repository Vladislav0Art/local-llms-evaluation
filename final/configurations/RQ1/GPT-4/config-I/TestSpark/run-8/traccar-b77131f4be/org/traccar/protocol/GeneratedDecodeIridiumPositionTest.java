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
public class GeneratedDecodeIridiumPositionTest {

    @Mock
    private Channel channel;

    @Test
    public void decodeIridiumPositionTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Test"));
        String id = "GALILEO_DEVICE_ID";

        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(Calendar.DAY_OF_YEAR, 1);
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMinimum(Calendar.HOUR_OF_DAY));
        calendar.set(Calendar.MINUTE, calendar.getActualMinimum(Calendar.MINUTE));
        calendar.set(Calendar.SECOND, calendar.getActualMinimum(Calendar.SECOND));
        calendar.set(Calendar.MILLISECOND, calendar.getActualMinimum(Calendar.MILLISECOND));
        position.setTime(calendar.getTime());
        Date fixTime = position.getTime();

        // Assemble msg
        ByteBuf msg = Unpooled.buffer();
        msg.writeByte(0x01); // header
        msg.writeShortLE(1 + id.length() + 4 + 3 + 4 + 23 + 3 + 10); // length
        msg.writeByte(0x03); // tag
        msg.writeCharSequence(id, StandardCharsets.US_ASCII); // device id
        msg.writeIntLE(1); // index
        msg.writeByte(0); // session status
        msg.writeZero(4); // reserved
        msg.writeIntLE((int) (fixTime.getTime() / 1000L)); // date and time

        // Remaining msg
        msg.writeZero(23); // coordinates block
        msg.writeIntLE(0); // header
        msg.writeZero(9); // rest data

        Postion postion = decoder.decodeIridiumPosition(channel, null, msg);
        assertNotNull(postion);
        assertEquals(fixTime, position.getFixTime());
    }

}