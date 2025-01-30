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
public class GeneratedDecodeMinimalDataSetTest {

    @Mock
    private Channel channel;

    @Test
    public void decodeMinimalDataSetTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Test"));
        Position position = new Position();

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0); // tag
        buf.writeBytes(new byte[10]); // minimal data set

        decoder.decodeMinimalDataSet(position, buf);

        assertNotNull(position.get(Position.KEY_VALID));
        assertNotNull(position.getLongitude());
        assertNotNull(position.getLatitude());
    }

}