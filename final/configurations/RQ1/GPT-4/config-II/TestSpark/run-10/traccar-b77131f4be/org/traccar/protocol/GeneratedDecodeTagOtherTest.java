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
public class GeneratedDecodeTagOtherTest {

    @Test
    public void decodeTagOtherTest() {
        Position position = new Position("galileo");
        ByteBuf buf = Unpooled.buffer(15);

        String uniqueId = "1234567890123";
        buf.writeByte(uniqueId.length());
        buf.writeCharSequence(uniqueId, StandardCharsets.US_ASCII);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());
        decoder.decodeTagOther(position, buf, 0xe1);

        assertEquals(uniqueId, position.getString(Position.KEY_RESULT));
    }

}